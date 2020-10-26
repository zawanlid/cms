package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CMSCUSTCRDDET")
@Entity(name = "cms_CustomerCrdDet")
public class CustomerCrdDet extends StandardEntity {
    private static final long serialVersionUID = -6704678589764381663L;

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

    @Column(name = "CRD_CUSTADDR4", length = 100)
    private String custAddr4;

    @Column(name = "CRD_CUSTADDR5", length = 100)
    private String custAddr5;

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
    private String custPhNo;

    @Column(name = "CRD_CUSTNOTES", length = 30)
    private String custNotes;

    @JoinColumn(name = "CUSTOMER_CRD_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private CustomerCrdMast customerCrdMast;

    public String getCustNotes() {
        return custNotes;
    }

    public void setCustNotes(String custNotes) {
        this.custNotes = custNotes;
    }

    public void setCustomerCrdMast(CustomerCrdMast customerCrdMast) {
        this.customerCrdMast = customerCrdMast;
    }

    public CustomerCrdMast getCustomerCrdMast() {
        return customerCrdMast;
    }

    public String getCustPhNo() {
        return custPhNo;
    }

    public void setCustPhNo(String custPhNo) {
        this.custPhNo = custPhNo;
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

    public String getCustAddr5() {
        return custAddr5;
    }

    public void setCustAddr5(String custAddr5) {
        this.custAddr5 = custAddr5;
    }

    public String getCustAddr4() {
        return custAddr4;
    }

    public void setCustAddr4(String custAddr4) {
        this.custAddr4 = custAddr4;
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