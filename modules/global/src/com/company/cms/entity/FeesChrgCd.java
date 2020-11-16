package com.company.cms.entity;

import com.company.cms.entity.model.ChrgCdTenorBy;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CMSFEES_CHRGCD")
@Entity(name = "cms_FeesChrgCd")
public class FeesChrgCd extends StandardEntity {
    private static final long serialVersionUID = -5205199172690286682L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "CHRGCD", length = 10)
    private String chrgCd;

    @Column(name = "CHRGCD_DESCR", length = 100)
    private String chrgCdDescr;

    @Column(name = "CHRGCD_CURR", length = 3)
    private String chrgCdCurr;

    @Column(name = "CHRGCD_TENORBY")
    private String chrgCdTenorby;

    @Column(name = "RATE1")
    private Integer rate1;

    @Column(name = "RATE2")
    private Integer rate2;

    @Column(name = "RATE3")
    private Integer rate3;

    @Column(name = "RATE4")
    private Integer rate4;

    @Column(name = "RATE5")
    private Integer rate5;

    @Column(name = "RATE6")
    private Integer rate6;

    @Column(name = "MINAMT")
    private Integer minAmt;

    @Column(name = "MAXAMT")
    private Integer maxAmt;

    @Column(name = "TAMT1")
    private Integer tamt1;

    @Column(name = "TAMT2")
    private Integer tamt2;

    @Column(name = "TAMT3")
    private Integer tamt3;

    @Column(name = "TAMT4")
    private Integer tamt4;

    @Column(name = "TAMT5")
    private Integer tamt5;

    @Column(name = "TAMT6")
    private Integer tamt6;

    @Column(name = "FAMT1")
    private Integer famt1;

    @Column(name = "FAMT2")
    private Integer famt2;

    @Column(name = "FAMT3")
    private Integer famt3;

    @Column(name = "FAMT4")
    private Integer famt4;

    @Column(name = "FAMT5")
    private Integer famt5;

    @Column(name = "FAMT6")
    private Integer famt6;

    @Column(name = "GLCD", length = 20)
    private String glCd;

    @Temporal(TemporalType.DATE)
    @Column(name = "LSTUPD")
    private Date lstUpd;

    public void setChrgCdTenorby(ChrgCdTenorBy chrgCdTenorby) {
        this.chrgCdTenorby = chrgCdTenorby == null ? null : chrgCdTenorby.getId();
    }

    public ChrgCdTenorBy getChrgCdTenorby() {
        return chrgCdTenorby == null ? null : ChrgCdTenorBy.fromId(chrgCdTenorby);
    }

    public Date getLstUpd() {
        return lstUpd;
    }

    public void setLstUpd(Date lstUpd) {
        this.lstUpd = lstUpd;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
    }

    public Integer getFamt6() {
        return famt6;
    }

    public void setFamt6(Integer famt6) {
        this.famt6 = famt6;
    }

    public Integer getFamt5() {
        return famt5;
    }

    public void setFamt5(Integer famt5) {
        this.famt5 = famt5;
    }

    public Integer getFamt4() {
        return famt4;
    }

    public void setFamt4(Integer famt4) {
        this.famt4 = famt4;
    }

    public Integer getFamt3() {
        return famt3;
    }

    public void setFamt3(Integer famt3) {
        this.famt3 = famt3;
    }

    public Integer getFamt2() {
        return famt2;
    }

    public void setFamt2(Integer famt2) {
        this.famt2 = famt2;
    }

    public Integer getFamt1() {
        return famt1;
    }

    public void setFamt1(Integer famt1) {
        this.famt1 = famt1;
    }

    public Integer getTamt6() {
        return tamt6;
    }

    public void setTamt6(Integer tamt6) {
        this.tamt6 = tamt6;
    }

    public Integer getTamt5() {
        return tamt5;
    }

    public void setTamt5(Integer tamt5) {
        this.tamt5 = tamt5;
    }

    public Integer getTamt4() {
        return tamt4;
    }

    public void setTamt4(Integer tamt4) {
        this.tamt4 = tamt4;
    }

    public Integer getTamt3() {
        return tamt3;
    }

    public void setTamt3(Integer tamt3) {
        this.tamt3 = tamt3;
    }

    public Integer getTamt2() {
        return tamt2;
    }

    public void setTamt2(Integer tamt2) {
        this.tamt2 = tamt2;
    }

    public Integer getTamt1() {
        return tamt1;
    }

    public void setTamt1(Integer tamt1) {
        this.tamt1 = tamt1;
    }

    public Integer getMaxAmt() {
        return maxAmt;
    }

    public void setMaxAmt(Integer maxAmt) {
        this.maxAmt = maxAmt;
    }

    public Integer getMinAmt() {
        return minAmt;
    }

    public void setMinAmt(Integer minAmt) {
        this.minAmt = minAmt;
    }

    public Integer getRate6() {
        return rate6;
    }

    public void setRate6(Integer rate6) {
        this.rate6 = rate6;
    }

    public Integer getRate5() {
        return rate5;
    }

    public void setRate5(Integer rate5) {
        this.rate5 = rate5;
    }

    public Integer getRate4() {
        return rate4;
    }

    public void setRate4(Integer rate4) {
        this.rate4 = rate4;
    }

    public Integer getRate3() {
        return rate3;
    }

    public void setRate3(Integer rate3) {
        this.rate3 = rate3;
    }

    public Integer getRate2() {
        return rate2;
    }

    public void setRate2(Integer rate2) {
        this.rate2 = rate2;
    }

    public Integer getRate1() {
        return rate1;
    }

    public void setRate1(Integer rate1) {
        this.rate1 = rate1;
    }

    public String getChrgCdCurr() {
        return chrgCdCurr;
    }

    public void setChrgCdCurr(String chrgCdCurr) {
        this.chrgCdCurr = chrgCdCurr;
    }

    public String getChrgCdDescr() {
        return chrgCdDescr;
    }

    public void setChrgCdDescr(String chrgCdDescr) {
        this.chrgCdDescr = chrgCdDescr;
    }

    public String getChrgCd() {
        return chrgCd;
    }

    public void setChrgCd(String chrgCd) {
        this.chrgCd = chrgCd;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }

    /**
     * This event listener is to clear not related fields.
     */
    @PrePersist
    public void prePersist() {
        this.clearNotRelatedFields();
    }

    /**
     * This event listener is to clear not related fields.
     */
    @PreUpdate
    public void preUpdate() {
        this.clearNotRelatedFields();
    }

    /**
     * Logic to clear not related fields.
     */
    private void clearNotRelatedFields() {

        switch (ChrgCdTenorBy.fromId(this.chrgCdTenorby)){
            case FIXED: {
                this.maxAmt = null;

                this.famt1  = null;
                this.famt2 = null;
                this.famt3 = null;
                this.famt4 = null;
                this.famt5 = null;

                this.rate1 = null;
                this.rate2 = null;
                this.rate3 = null;
                this.rate4 = null;
                this.rate5 = null;

                this.tamt1 = null;
                this.tamt2= null;
                this.tamt3= null;
                this.tamt4 = null;
                this.tamt5 = null;

                break;
            }
            case PERCENTAGE: {
                this.famt1 = null;
                this.famt2 = null;
                this.famt3 = null;
                this.famt4 = null;
                this.famt5 = null;

                break;
            }
            case X: {
                this.rate1 = null;
                this.rate2 = null;
                this.rate3 = null;
                this.rate4 = null;
                this.rate5 = null;

                break;
            }
            default: {
                this.minAmt = null;
                this.maxAmt = null;

                this.glCd   = null;

                this.tamt1  = null;
                this.tamt2 = null;
                this.tamt3 = null;
                this.tamt4 = null;
                this.tamt5 = null;

                this.rate1 = null;
                this.rate2 = null;
                this.rate3 = null;
                this.rate4 = null;
                this.rate5 = null;

                this.tamt1 = null;
                this.tamt2= null;
                this.tamt3= null;
                this.tamt4 = null;
                this.tamt5 = null;

                break;
            }
        }
    }
}