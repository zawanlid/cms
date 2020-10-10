package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSTRANS")
@Entity(name = "cms_CmsTrans")
public class CmsTrans extends StandardEntity {
    private static final long serialVersionUID = 5769178871518685944L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "PRI_TRANCD", length = 4)
    private String priTranCd;

    @Column(name = "SEC_TRANCD", length = 4)
    private String secTranCd;

    @Column(name = "TRANCD_DESCR", length = 100)
    private String tranCdDescr;

    @Column(name = "PERMITTED", length = 1)
    private String permitted;

    public String getPermitted() {
        return permitted;
    }

    public void setPermitted(String permitted) {
        this.permitted = permitted;
    }

    public String getTranCdDescr() {
        return tranCdDescr;
    }

    public void setTranCdDescr(String tranCdDescr) {
        this.tranCdDescr = tranCdDescr;
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