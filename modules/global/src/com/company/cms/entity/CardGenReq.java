package com.company.cms.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "CMSCARDGENREQ")
@Entity(name = "cms_CardGenReq")
public class CardGenReq extends StandardEntity {
    private static final long serialVersionUID = 6165258318492924892L;

    @NotNull
    @Column(name = "BRN_CD", nullable = false, length = 10)
    private String brnCd;

    @NotNull
    @Column(name = "BATCHNUM", nullable = false, length = 4)
    private String batchNum;

    @NotNull
    @Column(name = "BATCHSTS", nullable = false, length = 5)
    private String batchSts;

    @NotNull
    @Column(name = "BIN", nullable = false, length = 10)
    private String bin;

    @Temporal(TemporalType.DATE)
    @Column(name = "BTHREQ_DT")
    private Date bthreqDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRDEMB_DT")
    private Date crdembDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "PINMLR_DT")
    private Date pinmlrDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "FILEUPL_DT")
    private Date fileuplDt;

    @Column(name = "REQ_USERID1", length = 10)
    private String reqUserid1;

    @Column(name = "REQ_USERID2", length = 10)
    private String reqUserid2;

    @Column(name = "EMB_USERID1", length = 10)
    private String embUserid1;

    @Column(name = "EMB_USERID2", length = 10)
    private String embUserid2;

    @Column(name = "MLR_USERID1", length = 10)
    private String mlrUserid1;

    @Column(name = "MLR_USERID2", length = 10)
    private String mlrUserid2;

    @Column(name = "FUL_USERID1", length = 10)
    private String fulUserid1;

    @Column(name = "FUL_USERID2", length = 10)
    private String fulUserid2;

    @Column(name = "BATCH_CNT")
    private Integer batchCnt;

    @Column(name = "RENEW", length = 1)
    private String renew;

    @Column(name = "POSTGEN", length = 1)
    private String postGen;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATED")
    private Date lastUpdated;

    @Column(name = "STSUPD_USERID", length = 10)
    private String stsupdUserid;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "cardGenReq")
    private List<CardGenReqDet> cardGenReqDets;

    /**
     *  This event listener is to set foreign key values from card gen req to detail entities.
     */
    @PrePersist
    public void prePersist () {
        if (this.getCardGenReqDets() != null) {
            for (int i = 0; i < this.getCardGenReqDets().size(); i++) {
                this.getCardGenReqDets().get(i).setBrnCd(this.getBrnCd());
                this.getCardGenReqDets().get(i).setBatchNum(this.getBatchNum());
                this.getCardGenReqDets().get(i).setBin(this.getBin());
                this.getCardGenReqDets().get(i).setBthreqDt(this.getBthreqDt());
            }
        }
    }

    /**
     *  This event listener is to set foreign key values from card gen req to detail entities.
     */
    @PreUpdate
    public void preUpdate () {
        if (this.getCardGenReqDets() != null) {
            for (int i = 0; i < this.getCardGenReqDets().size(); i++) {
                this.getCardGenReqDets().get(i).setBrnCd(this.getBrnCd());
                this.getCardGenReqDets().get(i).setBatchNum(this.getBatchNum());
                this.getCardGenReqDets().get(i).setBin(this.getBin());
                this.getCardGenReqDets().get(i).setBthreqDt(this.getBthreqDt());
            }
        }
    }

    public String getStsupdUserid() {
        return stsupdUserid;
    }

    public void setStsupdUserid(String stsupdUserid) {
        this.stsupdUserid = stsupdUserid;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPostGen() {
        return postGen;
    }

    public void setPostGen(String postGen) {
        this.postGen = postGen;
    }

    public String getRenew() {
        return renew;
    }

    public void setRenew(String renew) {
        this.renew = renew;
    }

    public Integer getBatchCnt() {
        return batchCnt;
    }

    public void setBatchCnt(Integer batchCnt) {
        this.batchCnt = batchCnt;
    }

    public String getFulUserid2() {
        return fulUserid2;
    }

    public void setFulUserid2(String fulUserid2) {
        this.fulUserid2 = fulUserid2;
    }

    public String getFulUserid1() {
        return fulUserid1;
    }

    public void setFulUserid1(String fulUserid1) {
        this.fulUserid1 = fulUserid1;
    }

    public String getMlrUserid2() {
        return mlrUserid2;
    }

    public void setMlrUserid2(String mlrUserid2) {
        this.mlrUserid2 = mlrUserid2;
    }

    public String getMlrUserid1() {
        return mlrUserid1;
    }

    public void setMlrUserid1(String mlrUserid1) {
        this.mlrUserid1 = mlrUserid1;
    }

    public String getEmbUserid2() {
        return embUserid2;
    }

    public void setEmbUserid2(String embUserid2) {
        this.embUserid2 = embUserid2;
    }

    public String getEmbUserid1() {
        return embUserid1;
    }

    public void setEmbUserid1(String embUserid1) {
        this.embUserid1 = embUserid1;
    }

    public String getReqUserid2() {
        return reqUserid2;
    }

    public void setReqUserid2(String reqUserid2) {
        this.reqUserid2 = reqUserid2;
    }

    public String getReqUserid1() {
        return reqUserid1;
    }

    public void setReqUserid1(String reqUserid1) {
        this.reqUserid1 = reqUserid1;
    }

    public Date getFileuplDt() {
        return fileuplDt;
    }

    public void setFileuplDt(Date fileuplDt) {
        this.fileuplDt = fileuplDt;
    }

    public Date getPinmlrDt() {
        return pinmlrDt;
    }

    public void setPinmlrDt(Date pinmlrDt) {
        this.pinmlrDt = pinmlrDt;
    }

    public Date getCrdembDt() {
        return crdembDt;
    }

    public void setCrdembDt(Date crdembDt) {
        this.crdembDt = crdembDt;
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

    public String getBatchSts() {
        return batchSts;
    }

    public void setBatchSts(String batchSts) {
        this.batchSts = batchSts;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getBrnCd() {
        return brnCd;
    }

    public void setBrnCd(String brnCd) {
        this.brnCd = brnCd;
    }

    public List<CardGenReqDet> getCardGenReqDets() {
        return cardGenReqDets;
    }

    public void setCardGenReqDets(List<CardGenReqDet> cardGenReqDets) {
        this.cardGenReqDets = cardGenReqDets;
    }
}