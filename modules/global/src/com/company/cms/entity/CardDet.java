package com.company.cms.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "CMSCRDDET")
@Entity(name = "cms_CardDet")
public class CardDet extends StandardEntity {
    private static final long serialVersionUID = -7195572608551026012L;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "CRDNUM", length = 16)
    private String crdNum;

    @Column(name = "CRD_CUSTIDNO", length = 20)
    private String custIdNo;

    @Column(name = "CRD_CUSTSHRTNM", length = 50)
    private String custShrtNm;

    @Column(name = "CRD_CUSTLONGNM", length = 100)
    private String custLongNm;

    @Column(name = "CRD_CUSTADDR1", length = 100)
    private String custAddr1;

    @Column(name = "CRD_CUSTADDR2", length = 100)
    private String custAddr2;

    @Column(name = "CRD_CUSTADDR3", length = 100)
    private String custAddr3;

    @Column(name = "CRD_CUSTPOSTCD", length = 15)
    private String custPostCd;

    @Column(name = "CRD_CUSTCITY", length = 30)
    private String custCity;

    @Column(name = "CRD_CUSTSTATE", length = 30)
    private String custState;

    @Column(name = "CRD_CUSTCNTRY", length = 30)
    private String custCntry;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_CUSTDOB")
    private Date custDob;

    @Column(name = "CRD_CUSTPHNO", length = 30)
    private String custPhno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARD_MAST_ID")
    private CardMast cardMast;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "cardDet")
    private List<CardAcct> cardAccts;

    public List<CardAcct> getCardAccts() {
        return cardAccts;
    }

    public void setCardAccts(List<CardAcct> cardAccts) {
        this.cardAccts = cardAccts;
    }

    public CardMast getCardMast() {
        return cardMast;
    }

    public void setCardMast(CardMast cardMast) {
        this.cardMast = cardMast;
    }

    public String getCustPhno() {
        return custPhno;
    }

    public void setCustPhno(String custPhno) {
        this.custPhno = custPhno;
    }

    public Date getCustDob() {
        return custDob;
    }

    public void setCustDob(Date custDob) {
        this.custDob = custDob;
    }

    public String getCustCntry() {
        return custCntry;
    }

    public void setCustCntry(String custCntry) {
        this.custCntry = custCntry;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustPostCd() {
        return custPostCd;
    }

    public void setCustPostCd(String custPostCd) {
        this.custPostCd = custPostCd;
    }

    public String getCustAddr3() {
        return custAddr3;
    }

    public void setCustAddr3(String custAddr3) {
        this.custAddr3 = custAddr3;
    }

    public String getCustAddr2() {
        return custAddr2;
    }

    public void setCustAddr2(String custAddr2) {
        this.custAddr2 = custAddr2;
    }

    public String getCustAddr1() {
        return custAddr1;
    }

    public void setCustAddr1(String custAddr1) {
        this.custAddr1 = custAddr1;
    }

    public String getCustLongNm() {
        return custLongNm;
    }

    public void setCustLongNm(String custLongNm) {
        this.custLongNm = custLongNm;
    }

    public String getCustShrtNm() {
        return custShrtNm;
    }

    public void setCustShrtNm(String custShrtNm) {
        this.custShrtNm = custShrtNm;
    }

    public String getCustIdNo() {
        return custIdNo;
    }

    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
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