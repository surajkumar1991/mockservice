FROM us.gcr.io/ppp-prod/common:java-8-latest

COPY target/ubs-mock-services-0.0.1.jar /opt/ubs-mock-services/

#May be add property overrides

WORKDIR /opt/

RUN mkdir appConfig

WORKDIR /opt/ubs-mock-services/

RUN mkdir temp

ENTRYPOINT java $JAVA_OPTS -jar ./ubs-mock-services-0.0.1.jar

EXPOSE 7007
