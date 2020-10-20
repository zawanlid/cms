package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "CMSCARDGENREQDET")
@Entity(name = "cms_CardGenReqDet")
public class CardGenReqDet extends StandardEntity {
    private static final long serialVersionUID = -7401411503197838654L;

    @NotNull
    @Column(name = "BRNCD", nullable = false, length = 10)
    private String brnCd;

    @NotNull
    @Column(name = "BATCHNUM", nullable = false, length = 4)
    private String batchNum;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CARD_GEN_ID")
    private CardGenReq cardGenReq;

    @NotNull
    @Column(name = "BIN", nullable = false, length = 10)
    private String bin;

    @Temporal(TemporalType.DATE)
    @Column(name = "BTHREQ_DT")
    private Date bthreqDt;

    @Column(name = "CARDNUM", length = 16)
    private String cardNum;

    @Column(name = "EMBOSSNM", length = 30)
    private String embossNm;

    @Column(name = "LONGNM", length = 100)
    private String longNm;

    @Column(name = "LANG", length = 1)
    private String lang;

    @Column(name = "STATE", length = 40)
    private String state;

    @Column(name = "COUNTRY", length = 40)
    private String country;

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPDT")
    private Date expDt;


    public Date getExpDt() {
        return expDt;
    }

    public void setExpDt(Date expDt) {
        this.expDt = expDt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLongNm() {
        return longNm;
    }

    public void setLongNm(String longNm) {
        this.longNm = longNm;
    }

    public String getEmbossNm() {
        return embossNm;
    }

    public void setEmbossNm(String embossNm) {
        this.embossNm = embossNm;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Date getBthreqDt() {
        return bthreqDt;
    }

    public void setBthreqDt(Date bthreqDt) {
        this.bthreqDt = bthreqDt;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }


    public String getBrnCd() {
        return brnCd;
    }

    public void setBrnCd(String brnCd) {
        this.brnCd = brnCd;
    }

    public CardGenReq getCardGenReq() {
        return cardGenReq;
    }

    public void setCardGenReq(CardGenReq cardGenReq) {
        this.cardGenReq = cardGenReq;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }
}