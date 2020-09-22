package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSCRDPROFILE")
@Entity(name = "cms_CardProfile")
public class CardProfile extends StandardEntity {
    private static final long serialVersionUID = -148252474271127635L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "BIN_DESCR", length = 45)
    private String binDescr;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "BINLEN")
    private Integer binLen;

    @Column(name = "CRDLEN")
    private Integer cardLen;

    @Column(name = "PANLEN")
    private Integer panLen;

    public Integer getPanLen() {
        return panLen;
    }

    public void setPanLen(Integer panLen) {
        this.panLen = panLen;
    }

    public Integer getCardLen() {
        return cardLen;
    }

    public void setCardLen(Integer cardLen) {
        this.cardLen = cardLen;
    }

    public Integer getBinLen() {
        return binLen;
    }

    public void setBinLen(Integer binLen) {
        this.binLen = binLen;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBinDescr() {
        return binDescr;
    }

    public void setBinDescr(String binDescr) {
        this.binDescr = binDescr;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}