package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CMSCRDCOND_ACCTTYPE")
@Entity(name = "cms_CardCondAcctType")
public class CardCondAcctType extends StandardEntity {
    private static final long serialVersionUID = -6093546925637729383L;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "ACCT_TYPE", length = 4)
    private String acctType;

    @Column(name = "AGE_FRM")
    private Integer ageFrm;

    @Column(name = "AGE_TO")
    private Integer ageTo;

    @Column(name = "JNTHLDR_NO")
    private Integer jnthldrNo;

    @Column(name = "OPT_NOTJNT", length = 1)
    private String optNotJnt;

    @Column(name = "OPT_OR", length = 1)
    private String optOr;

    @Column(name = "OPT_AND", length = 1)
    private String optAnd;

    @Column(name = "OPT_TRUSTEE", length = 1)
    private String optTrustee;

    @Column(name = "OPT_CLIENT", length = 1)
    private String optClient;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CARD_COND_ID")
    private CardCond cardCond;

    public String getOptClient() {
        return optClient;
    }

    public void setOptClient(String optClient) {
        this.optClient = optClient;
    }

    public String getOptTrustee() {
        return optTrustee;
    }

    public void setOptTrustee(String optTrustee) {
        this.optTrustee = optTrustee;
    }

    public String getOptAnd() {
        return optAnd;
    }

    public void setOptAnd(String optAnd) {
        this.optAnd = optAnd;
    }

    public String getOptOr() {
        return optOr;
    }

    public void setOptOr(String optOr) {
        this.optOr = optOr;
    }

    public String getOptNotJnt() {
        return optNotJnt;
    }

    public void setOptNotJnt(String optNotJnt) {
        this.optNotJnt = optNotJnt;
    }

    public Integer getJnthldrNo() {
        return jnthldrNo;
    }

    public void setJnthldrNo(Integer jnthldrNo) {
        this.jnthldrNo = jnthldrNo;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }

    public Integer getAgeFrm() {
        return ageFrm;
    }

    public void setAgeFrm(Integer ageFrm) {
        this.ageFrm = ageFrm;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public CardCond getCardCond() {
        return cardCond;
    }

    public void setCardCond(CardCond cardCond) {
        this.cardCond = cardCond;
    }
}