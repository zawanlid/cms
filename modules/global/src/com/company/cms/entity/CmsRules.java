package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSRULES")
@Entity(name = "cms_CmsRules")
public class CmsRules extends StandardEntity {
    private static final long serialVersionUID = -2762998508619288981L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "RNAME", length = 50)
    private String rName;

    @Column(name = "RDESCR", length = 100)
    private String rDescr;

    @Column(name = "STS", length = 1)
    private String sts;

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getRDescr() {
        return rDescr;
    }

    public void setRDescr(String rDescr) {
        this.rDescr = rDescr;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}