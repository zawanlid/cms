package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CMSBRNMAINT")
@Entity(name = "cms_BrnMaint")
public class BrnMaint extends StandardEntity {
    private static final long serialVersionUID = -5931683390506858781L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "BRNCD", length = 10)
    private String brnCd;

    @Column(name = "BRN_NM")
    private Integer brnNm;

    @Column(name = "ADDR1", length = 30)
    private String addr1;

    @Column(name = "ADDR2", length = 30)
    private String addr2;

    @Column(name = "ADDR3", length = 30)
    private String addr3;

    @Column(name = "CITY", length = 30)
    private String city;

    @Column(name = "STATE", length = 30)
    private String state;

    @Column(name = "CNTRYCD", length = 2)
    private String cntryCd;

    @Column(name = "MAINT_TYPE", length = 1)
    private String maintType;

    @Column(name = "THRESHOLD")
    private Integer threshold;

    @Column(name = "TOTAL_CRD")
    private Integer totalCrd;

    @Column(name = "ISSUED_CRD")
    private Integer issuedCrd;

    @Column(name = "CURR_CRD_LVL")
    private Integer currCrdLvl;

    @Column(name = "TOTAL_BATCHNUM")
    private Integer totalBatchNum;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_BATCHDT")
    private Date lastBatchDt;

    public Date getLastBatchDt() {
        return lastBatchDt;
    }

    public void setLastBatchDt(Date lastBatchDt) {
        this.lastBatchDt = lastBatchDt;
    }

    public Integer getTotalBatchNum() {
        return totalBatchNum;
    }

    public void setTotalBatchNum(Integer totalBatchNum) {
        this.totalBatchNum = totalBatchNum;
    }

    public Integer getCurrCrdLvl() {
        return currCrdLvl;
    }

    public void setCurrCrdLvl(Integer currCrdLvl) {
        this.currCrdLvl = currCrdLvl;
    }

    public Integer getIssuedCrd() {
        return issuedCrd;
    }

    public void setIssuedCrd(Integer issuedCrd) {
        this.issuedCrd = issuedCrd;
    }

    public Integer getTotalCrd() {
        return totalCrd;
    }

    public void setTotalCrd(Integer totalCrd) {
        this.totalCrd = totalCrd;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public String getMaintType() {
        return maintType;
    }

    public void setMaintType(String maintType) {
        this.maintType = maintType;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public Integer getBrnNm() {
        return brnNm;
    }

    public void setBrnNm(Integer brnNm) {
        this.brnNm = brnNm;
    }

    public String getBrnCd() {
        return brnCd;
    }

    public void setBrnCd(String brnCd) {
        this.brnCd = brnCd;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}