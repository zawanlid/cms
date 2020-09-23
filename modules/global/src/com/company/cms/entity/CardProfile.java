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

    @Column(name = "CRD_FMT", length = 16)
    private String crdFmt;

    @Column(name = "PVKI", length = 2)
    private String pvki;

    @Column(name = "ENC_METHOD", length = 1)
    private String encMethod;

    @Column(name = "PIN_TYPE", length = 1)
    private String pinType;

    @Column(name = "PIN_OFFSET")
    private Integer pinOffset;

    @Column(name = "PAN_OFFSET")
    private Integer panOffset;

    @Column(name = "PIN_LEN")
    private Integer pinLen;

    @Column(name = "PIN_CHK_LEN")
    private Integer pinChkLen;

    @Column(name = "PAD_CHAR", length = 1)
    private String padChar;

    @Column(name = "SER_VCD", length = 5)
    private String serVcd;

    @Column(name = "MAILER_TYPE", length = 1)
    private String mailerType;

    @Column(name = "DEC_TBL", length = 16)
    private String decTbl;

    @Column(name = "PVK1", length = 49)
    private String pvk1;

    @Column(name = "PVK1_KCV", length = 8)
    private String pvk1Kcv;

    @Column(name = "PVK2", length = 49)
    private String pvk2;

    @Column(name = "PVK2_KCV", length = 8)
    private String pvk2Kcv;

    @Column(name = "CVK1", length = 49)
    private String cvk1;

    @Column(name = "CVK1_KCV", length = 8)
    private String cvk1Kcv;

    @Column(name = "CVK2", length = 16)
    private String cvk2;

    @Column(name = "CVK2_KCV", length = 8)
    private String cvk2Kcv;

    @Column(name = "PIN_ALG")
    private Integer pinAlg;

    @Column(name = "CRD_TYPE", length = 15)
    private String crdType;

    public String getCrdType() {
        return crdType;
    }

    public void setCrdType(String crdType) {
        this.crdType = crdType;
    }

    public Integer getPinAlg() {
        return pinAlg;
    }

    public void setPinAlg(Integer pinAlg) {
        this.pinAlg = pinAlg;
    }

    public String getCvk2Kcv() {
        return cvk2Kcv;
    }

    public void setCvk2Kcv(String cvk2Kcv) {
        this.cvk2Kcv = cvk2Kcv;
    }

    public String getCvk2() {
        return cvk2;
    }

    public void setCvk2(String cvk2) {
        this.cvk2 = cvk2;
    }

    public String getCvk1Kcv() {
        return cvk1Kcv;
    }

    public void setCvk1Kcv(String cvk1Kcv) {
        this.cvk1Kcv = cvk1Kcv;
    }

    public String getCvk1() {
        return cvk1;
    }

    public void setCvk1(String cvk1) {
        this.cvk1 = cvk1;
    }

    public String getPvk2Kcv() {
        return pvk2Kcv;
    }

    public void setPvk2Kcv(String pvk2Kcv) {
        this.pvk2Kcv = pvk2Kcv;
    }

    public String getPvk2() {
        return pvk2;
    }

    public void setPvk2(String pvk2) {
        this.pvk2 = pvk2;
    }

    public String getPvk1Kcv() {
        return pvk1Kcv;
    }

    public void setPvk1Kcv(String pvk1Kcv) {
        this.pvk1Kcv = pvk1Kcv;
    }

    public String getPvk1() {
        return pvk1;
    }

    public void setPvk1(String pvk1) {
        this.pvk1 = pvk1;
    }

    public String getDecTbl() {
        return decTbl;
    }

    public void setDecTbl(String decTbl) {
        this.decTbl = decTbl;
    }

    public String getMailerType() {
        return mailerType;
    }

    public void setMailerType(String mailerType) {
        this.mailerType = mailerType;
    }

    public String getSerVcd() {
        return serVcd;
    }

    public void setSerVcd(String serVcd) {
        this.serVcd = serVcd;
    }

    public String getPadChar() {
        return padChar;
    }

    public void setPadChar(String padChar) {
        this.padChar = padChar;
    }

    public Integer getPinChkLen() {
        return pinChkLen;
    }

    public void setPinChkLen(Integer pinChkLen) {
        this.pinChkLen = pinChkLen;
    }

    public Integer getPinLen() {
        return pinLen;
    }

    public void setPinLen(Integer pinLen) {
        this.pinLen = pinLen;
    }

    public Integer getPanOffset() {
        return panOffset;
    }

    public void setPanOffset(Integer panOffset) {
        this.panOffset = panOffset;
    }

    public Integer getPinOffset() {
        return pinOffset;
    }

    public void setPinOffset(Integer pinOffset) {
        this.pinOffset = pinOffset;
    }

    public String getPinType() {
        return pinType;
    }

    public void setPinType(String pinType) {
        this.pinType = pinType;
    }

    public String getEncMethod() {
        return encMethod;
    }

    public void setEncMethod(String encMethod) {
        this.encMethod = encMethod;
    }

    public String getPvki() {
        return pvki;
    }

    public void setPvki(String pvki) {
        this.pvki = pvki;
    }

    public String getCrdFmt() {
        return crdFmt;
    }

    public void setCrdFmt(String crdFmt) {
        this.crdFmt = crdFmt;
    }

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