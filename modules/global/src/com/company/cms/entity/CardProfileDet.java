package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSCRDPROFILEDET")
@Entity(name = "cms_CardProfileDet")
public class CardProfileDet extends StandardEntity {
    private static final long serialVersionUID = -147695300534237862L;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "RENEW_PERIOD")
    private Integer renewPeriod;

    @Column(name = "ENF_GLB_LMT", length = 1)
    private String enfGlbLmt;

    @Column(name = "CYC_PRD_DEF")
    private Integer cycPrdDef;

    @Column(name = "CYC_PRD_MAX")
    private Integer cycPrdMax;

    @Column(name = "WDL_DEF_LMT")
    private Integer wdlDefLmt;

    @Column(name = "WDL_MAX_LMT")
    private Integer wdlMaxLmt;

    @Column(name = "FWDL_DEF_LMT")
    private Integer fwdlDefLmt;

    @Column(name = "FWDL_MAX_LMT")
    private Integer fwdlMaxLmt;

    @Column(name = "NET_WDL_DEF_LMT")
    private Integer netWdlDefLmt;

    @Column(name = "NET_WDL_MAX_LMT")
    private Integer netWdlMaxLmt;

    @Column(name = "MBL_TRF_LMT")
    private Integer mblTrfLmt;

    @Column(name = "MBL_TRF_MAX_LMT")
    private Integer mblTrfMaxLmt;

    @Column(name = "TRF_DEF_LMT")
    private Integer trfDefLmt;

    @Column(name = "TRF_MAX_LMT")
    private Integer trfMaxLmt;

    @Column(name = "TRFCR_DEF_LMT")
    private Integer trfcrDefLmt;

    @Column(name = "TRFCR_MAX_LMT")
    private Integer trfcrMaxLmt;

    @Column(name = "THRDTRF_DEF_LMT")
    private Integer thrdtrfDefLmt;

    @Column(name = "THRDTRF_MAX_LMT")
    private Integer thrdtrfMaxLmt;

    @Column(name = "IBFT_DEF_LMT")
    private Integer ibftDefLmt;

    @Column(name = "IBFT_MAX_LMT")
    private Integer ibftMaxLmt;

    @Column(name = "IBFTDR_DEF_LMT")
    private Integer ibftdrDefLmt;

    @Column(name = "IBFTDR_MAX_LMT")
    private Integer ibftdrMaxLmt;

    @Column(name = "IBFTCR_DEF_LMT")
    private Integer ibftcrDefLmt;

    @Column(name = "IBFTCR_MAX_LMT")
    private Integer ibftcrMaxLmt;

    @Column(name = "PINTRIES_DEF_LMT")
    private Integer pintriesDefLmt;

    @Column(name = "PINTRIES_MAX_LMT")
    private Integer pintriesMaxLmt;

    @Column(name = "FREETXN_DEF_LMT")
    private Integer freetxnDefLmt;

    @Column(name = "FREETXN_MAX_LMT")
    private Integer freetxnMaxLmt;

    @Column(name = "DEP_DET_LMT")
    private Integer depDetLmt;

    @Column(name = "DEP_MAX_LMT")
    private Integer depMaxLmt;

    @Column(name = "CRD_DEF_LMT")
    private Integer crdDefLmt;

    @Column(name = "CRD_MAX_LMT")
    private Integer crdMaxLmt;

    public Integer getCrdMaxLmt() {
        return crdMaxLmt;
    }

    public void setCrdMaxLmt(Integer crdMaxLmt) {
        this.crdMaxLmt = crdMaxLmt;
    }

    public Integer getCrdDefLmt() {
        return crdDefLmt;
    }

    public void setCrdDefLmt(Integer crdDefLmt) {
        this.crdDefLmt = crdDefLmt;
    }

    public Integer getIbftcrDefLmt() {
        return ibftcrDefLmt;
    }

    public void setIbftcrDefLmt(Integer ibftcrDefLmt) {
        this.ibftcrDefLmt = ibftcrDefLmt;
    }

    public Integer getDepMaxLmt() {
        return depMaxLmt;
    }

    public void setDepMaxLmt(Integer depMaxLmt) {
        this.depMaxLmt = depMaxLmt;
    }

    public Integer getDepDetLmt() {
        return depDetLmt;
    }

    public void setDepDetLmt(Integer depDetLmt) {
        this.depDetLmt = depDetLmt;
    }

    public Integer getFreetxnMaxLmt() {
        return freetxnMaxLmt;
    }

    public void setFreetxnMaxLmt(Integer freetxnMaxLmt) {
        this.freetxnMaxLmt = freetxnMaxLmt;
    }

    public Integer getFreetxnDefLmt() {
        return freetxnDefLmt;
    }

    public void setFreetxnDefLmt(Integer freetxnDefLmt) {
        this.freetxnDefLmt = freetxnDefLmt;
    }

    public Integer getPintriesMaxLmt() {
        return pintriesMaxLmt;
    }

    public void setPintriesMaxLmt(Integer pintriesMaxLmt) {
        this.pintriesMaxLmt = pintriesMaxLmt;
    }

    public Integer getPintriesDefLmt() {
        return pintriesDefLmt;
    }

    public void setPintriesDefLmt(Integer pintriesDefLmt) {
        this.pintriesDefLmt = pintriesDefLmt;
    }

    public Integer getIbftdrMaxLmt() {
        return ibftdrMaxLmt;
    }

    public void setIbftdrMaxLmt(Integer ibftdrMaxLmt) {
        this.ibftdrMaxLmt = ibftdrMaxLmt;
    }

    public Integer getIbftdrDefLmt() {
        return ibftdrDefLmt;
    }

    public void setIbftdrDefLmt(Integer ibftdrDefLmt) {
        this.ibftdrDefLmt = ibftdrDefLmt;
    }

    public Integer getIbftMaxLmt() {
        return ibftMaxLmt;
    }

    public void setIbftMaxLmt(Integer ibftMaxLmt) {
        this.ibftMaxLmt = ibftMaxLmt;
    }

    public Integer getIbftDefLmt() {
        return ibftDefLmt;
    }

    public void setIbftDefLmt(Integer ibftDefLmt) {
        this.ibftDefLmt = ibftDefLmt;
    }

    public Integer getThrdtrfMaxLmt() {
        return thrdtrfMaxLmt;
    }

    public void setThrdtrfMaxLmt(Integer thrdtrfMaxLmt) {
        this.thrdtrfMaxLmt = thrdtrfMaxLmt;
    }

    public Integer getThrdtrfDefLmt() {
        return thrdtrfDefLmt;
    }

    public void setThrdtrfDefLmt(Integer thrdtrfDefLmt) {
        this.thrdtrfDefLmt = thrdtrfDefLmt;
    }

    public Integer getTrfcrMaxLmt() {
        return trfcrMaxLmt;
    }

    public void setTrfcrMaxLmt(Integer trfcrMaxLmt) {
        this.trfcrMaxLmt = trfcrMaxLmt;
    }

    public Integer getTrfcrDefLmt() {
        return trfcrDefLmt;
    }

    public void setTrfcrDefLmt(Integer trfcrDefLmt) {
        this.trfcrDefLmt = trfcrDefLmt;
    }

    public Integer getTrfMaxLmt() {
        return trfMaxLmt;
    }

    public void setTrfMaxLmt(Integer trfMaxLmt) {
        this.trfMaxLmt = trfMaxLmt;
    }

    public Integer getTrfDefLmt() {
        return trfDefLmt;
    }

    public void setTrfDefLmt(Integer trfDefLmt) {
        this.trfDefLmt = trfDefLmt;
    }

    public Integer getMblTrfMaxLmt() {
        return mblTrfMaxLmt;
    }

    public void setMblTrfMaxLmt(Integer mblTrfMaxLmt) {
        this.mblTrfMaxLmt = mblTrfMaxLmt;
    }

    public Integer getMblTrfLmt() {
        return mblTrfLmt;
    }

    public void setMblTrfLmt(Integer mblTrfLmt) {
        this.mblTrfLmt = mblTrfLmt;
    }

    public Integer getNetWdlMaxLmt() {
        return netWdlMaxLmt;
    }

    public void setNetWdlMaxLmt(Integer netWdlMaxLmt) {
        this.netWdlMaxLmt = netWdlMaxLmt;
    }

    public Integer getNetWdlDefLmt() {
        return netWdlDefLmt;
    }

    public void setNetWdlDefLmt(Integer netWdlDefLmt) {
        this.netWdlDefLmt = netWdlDefLmt;
    }

    public Integer getFwdlMaxLmt() {
        return fwdlMaxLmt;
    }

    public void setFwdlMaxLmt(Integer fwdlMaxLmt) {
        this.fwdlMaxLmt = fwdlMaxLmt;
    }

    public Integer getFwdlDefLmt() {
        return fwdlDefLmt;
    }

    public void setFwdlDefLmt(Integer fwdlDefLmt) {
        this.fwdlDefLmt = fwdlDefLmt;
    }

    public Integer getWdlMaxLmt() {
        return wdlMaxLmt;
    }

    public void setWdlMaxLmt(Integer wdlMaxLmt) {
        this.wdlMaxLmt = wdlMaxLmt;
    }

    public Integer getWdlDefLmt() {
        return wdlDefLmt;
    }

    public void setWdlDefLmt(Integer wdlDefLmt) {
        this.wdlDefLmt = wdlDefLmt;
    }

    public Integer getCycPrdMax() {
        return cycPrdMax;
    }

    public void setCycPrdMax(Integer cycPrdMax) {
        this.cycPrdMax = cycPrdMax;
    }

    public Integer getCycPrdDef() {
        return cycPrdDef;
    }

    public void setCycPrdDef(Integer cycPrdDef) {
        this.cycPrdDef = cycPrdDef;
    }

    public String getEnfGlbLmt() {
        return enfGlbLmt;
    }

    public void setEnfGlbLmt(String enfGlbLmt) {
        this.enfGlbLmt = enfGlbLmt;
    }

    public Integer getRenewPeriod() {
        return renewPeriod;
    }

    public void setRenewPeriod(Integer renewPeriod) {
        this.renewPeriod = renewPeriod;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public Integer getIbftcrMaxLmt() {
        return ibftcrMaxLmt;
    }

    public void setIbftcrMaxLmt(Integer ibftcrMaxLmt) {
        this.ibftcrMaxLmt = ibftcrMaxLmt;
    }
}