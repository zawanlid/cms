package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSTPRULE")
@Entity(name = "cms_CmsTPRule")
public class CmsTPRule extends StandardEntity {
    private static final long serialVersionUID = 6781800885985026976L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "PRI_TRANCD", length = 50)
    private String priTranCd;

    @Column(name = "SEC_TRANCD", length = 100)
    private String secTranCd;

    @Column(name = "RNAME", length = 50)
    private String rName;

    @Column(name = "INDX")
    private Integer indx;

    @Column(name = "STEP")
    private Integer step;

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getIndx() {
        return indx;
    }

    public void setIndx(Integer indx) {
        this.indx = indx;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getSecTranCd() {
        return secTranCd;
    }

    public void setSecTranCd(String secTranCd) {
        this.secTranCd = secTranCd;
    }

    public String getPriTranCd() {
        return priTranCd;
    }

    public void setPriTranCd(String priTranCd) {
        this.priTranCd = priTranCd;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}