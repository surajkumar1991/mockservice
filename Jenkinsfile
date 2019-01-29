ciNode = ""
repoName = "jenkinslibrary"
branchName = "master"

node {
    ciNode = env.UBS_SLAVE ?: "master"
}

node(ciNode) {
    checkout scm
    library(identifier: "customlibrary@$branchName",
            changelog: true,
            retriever: modernSCM([$class       : 'GitSCMSource',
                                  remote       : "https://bitbucket.org/vuclipengineering/" + "$repoName" + ".git",
                                  extensions   : [[$class: 'CleanBeforeCheckout']],
                                  branches     : [[name: "$branchName"]],
                                  credentialsId: 'BITBUCKET_SINGH']))
    customPipeline.execute(ciNode)
}