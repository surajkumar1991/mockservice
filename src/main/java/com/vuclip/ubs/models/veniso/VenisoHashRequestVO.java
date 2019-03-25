package com.vuclip.ubs.models.veniso;

import groovy.transform.ToString;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class VenisoHashRequestVO {

    public String action;
    public String htxnid;
    public String lang;
    public String productcode;
    public String planid;
    public String rurl;
    public String imgurl;

}