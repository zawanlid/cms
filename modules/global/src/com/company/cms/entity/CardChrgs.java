package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSCRDCHRGS")
@Entity(name = "cms_CardChrgs")
public class CardChrgs extends StandardEntity {
    private static final long serialVersionUID = 7733270916902004582L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "CHRGS_TYPE", length = 4)
    private String chrgsType;

    @Column(name = "CHRGS_DESCR", length = 50)
    private String chrgsDescr;

    @Column(name = "OPT_1TM", length = 1)
    private String opt1tm;

    @Column(name = "OPT_STAFF_WAIVE", length = 1)
    private String optStaffWaive;

    @Column(name = "OPT_CHRG_FREQ", length = 1)
    private String optChrgFreq;

    @Column(name = "OPT_CHRG_BY", length = 1)
    private String optChrgBy;

    @Column(name = "CHRG_AMT")
    private Integer chrgAmt;

    public Integer getChrgAmt() {
        return chrgAmt;
    }

    public void setChrgAmt(Integer chrgAmt) {
        this.chrgAmt = chrgAmt;
    }

    public String getOptChrgBy() {
        return optChrgBy;
    }

    public void setOptChrgBy(String optChrgBy) {
        this.optChrgBy = optChrgBy;
    }

    public String getOptChrgFreq() {
        return optChrgFreq;
    }

    public void setOptChrgFreq(String optChrgFreq) {
        this.optChrgFreq = optChrgFreq;
    }

    public String getOptStaffWaive() {
        return optStaffWaive;
    }

    public void setOptStaffWaive(String optStaffWaive) {
        this.optStaffWaive = optStaffWaive;
    }

    public String getOpt1tm() {
        return opt1tm;
    }

    public void setOpt1tm(String opt1tm) {
        this.opt1tm = opt1tm;
    }

    public String getChrgsDescr() {
        return chrgsDescr;
    }

    public void setChrgsDescr(String chrgsDescr) {
        this.chrgsDescr = chrgsDescr;
    }

    public String getChrgsType() {
        return chrgsType;
    }

    public void setChrgsType(String chrgsType) {
        this.chrgsType = chrgsType;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}