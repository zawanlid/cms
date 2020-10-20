package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CMSCRDACCT")
@Entity(name = "cms_CardAcct")
public class CardAcct extends StandardEntity {
    private static final long serialVersionUID = -6778809572501403521L;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "CRDNUM", length = 16)
    private String crdNum;

    @Column(name = "CRD_ACCTNO", length = 18)
    private String acctNo;

    @Column(name = "CRD_ACCTTYPE", length = 2)
    private String acctType;

    @Column(name = "CRD_ACCTCCY", length = 3)
    private String acctCcy;

    @Column(name = "CRD_ACCTSTS", length = 1)
    private String acctSts;

    @Column(name = "CRD_OPT_PRIACCT", length = 1)
    private String optPriAcct;

    @Column(name = "CRD_OPT_FCSH", length = 1)
    private String optFcsh;

    @Column(name = "CRD_OPT_CSH", length = 1)
    private String optCsh;

    @Column(name = "CRD_OPT_DEP", length = 1)
    private String optDep;

    @Column(name = "CRD_OPT_INQ", length = 1)
    private String optInq;

    @Column(name = "CRD_OPT_REQ", length = 1)
    private String optReq;

    @Column(name = "CRD_OPT_TRF", length = 1)
    private String optTrf;

    @Column(name = "CRD_OPT_TRFDR", length = 1)
    private String optTrfDr;

    @Column(name = "CRD_OPT_TRFCR", length = 1)
    private String optTrfCr;

    @Column(name = "CRD_OPT_TRF3", length = 1)
    private String optTrf3;

    @Column(name = "CRD_OPT_IBFT", length = 1)
    private String optIbft;

    @Column(name = "CRD_OPT_IBFTDR", length = 1)
    private String optIbftDr;

    @Column(name = "CRD_OPT_IBFTCR", length = 1)
    private String optIbftCr;

    @Column(name = "OPT_RPLM", length = 1)
    private String optRplm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARD_DET_ID")
    private CardDet cardDet;

    public String getOptRplm() {
        return optRplm;
    }

    public void setOptRplm(String optRplm) {
        this.optRplm = optRplm;
    }

    public CardDet getCardDet() {
        return cardDet;
    }

    public void setCardDet(CardDet cardDet) {
        this.cardDet = cardDet;
    }

    public String getOptIbftCr() {
        return optIbftCr;
    }

    public void setOptIbftCr(String optIbftCr) {
        this.optIbftCr = optIbftCr;
    }

    public String getOptIbftDr() {
        return optIbftDr;
    }

    public void setOptIbftDr(String optIbftDr) {
        this.optIbftDr = optIbftDr;
    }

    public String getOptIbft() {
        return optIbft;
    }

    public void setOptIbft(String optIbft) {
        this.optIbft = optIbft;
    }

    public String getOptTrf3() {
        return optTrf3;
    }

    public void setOptTrf3(String optTrf3) {
        this.optTrf3 = optTrf3;
    }

    public String getOptTrfCr() {
        return optTrfCr;
    }

    public void setOptTrfCr(String optTrfCr) {
        this.optTrfCr = optTrfCr;
    }

    public String getOptTrfDr() {
        return optTrfDr;
    }

    public void setOptTrfDr(String optTrfDr) {
        this.optTrfDr = optTrfDr;
    }

    public String getOptTrf() {
        return optTrf;
    }

    public void setOptTrf(String optTrf) {
        this.optTrf = optTrf;
    }

    public String getOptReq() {
        return optReq;
    }

    public void setOptReq(String optReq) {
        this.optReq = optReq;
    }

    public String getOptInq() {
        return optInq;
    }

    public void setOptInq(String optInq) {
        this.optInq = optInq;
    }

    public String getOptDep() {
        return optDep;
    }

    public void setOptDep(String optDep) {
        this.optDep = optDep;
    }

    public String getOptCsh() {
        return optCsh;
    }

    public void setOptCsh(String optCsh) {
        this.optCsh = optCsh;
    }

    public String getOptFcsh() {
        return optFcsh;
    }

    public void setOptFcsh(String optFcsh) {
        this.optFcsh = optFcsh;
    }

    public String getOptPriAcct() {
        return optPriAcct;
    }

    public void setOptPriAcct(String optPriAcct) {
        this.optPriAcct = optPriAcct;
    }

    public String getAcctSts() {
        return acctSts;
    }

    public void setAcctSts(String acctSts) {
        this.acctSts = acctSts;
    }

    public String getAcctCcy() {
        return acctCcy;
    }

    public void setAcctCcy(String acctCcy) {
        this.acctCcy = acctCcy;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getCrdNum() {
        return crdNum;
    }

    public void setCrdNum(String crdNum) {
        this.crdNum = crdNum;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}