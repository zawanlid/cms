package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CMSCUSTCRDMAST")
@Entity(name = "cms_CustomerCrdMast")
public class CustomerCrdMast extends StandardEntity {
    private static final long serialVersionUID = 7713774396214307818L;

    @Column(name = "INSTNO")
    private Integer instno;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "CRDNUM", length = 16)
    private String crdNum;

    @Column(name = "CRDSTS", length = 2)
    private String crdSts;

    @Column(name = "CRD_CLSTYPE", length = 5)
    private String clsType;

    @Column(name = "CRD_ISSUED")
    private Integer issued;

    @Column(name = "CRD_RETURN")
    private Integer crdReturn;

    @Column(name = "CRD_CYCPRD")
    private Integer cycPrd;

    @Column(name = "CRD_EMBOSSNM", length = 28)
    private String embossNm;

    @Column(name = "CRD_PINRETRIES_CNT")
    private Integer pinRetriesCnt;

    @Column(name = "CRD_PINOFFSET", length = 12)
    private String pinOffset;

    @Column(name = "CRD_PINSERIALNO", length = 18)
    private String pinSerialNo;

    @Column(name = "CRD_EXPMTH", length = 2)
    private String expMth;

    @Column(name = "CRD_EXPYR", length = 4)
    private String expYr;

    @Column(name = "CRD_COLLECT_TYPE", length = 2)
    private String collectType;

    @Column(name = "CRD_CSH_AVL")
    private Integer cshAvl;

    @Column(name = "CRD_CSH_LMT")
    private Integer cshLmt;

    @Column(name = "CRD_OFF_CSH_AVL")
    private Integer offCshAvl;

    @Column(name = "CRD_OFF_CSH_LMT")
    private Integer offCshLmt;

    @Column(name = "CRD_TRN_AVL")
    private Integer trnAvl;

    @Column(name = "CRD_TRN_LMT")
    private Integer trnLmt;

    @Column(name = "CRD_TRNDR_AVL")
    private Integer trndrAvl;

    @Column(name = "CRD_TRNDR_LMT")
    private Integer trndrLmt;

    @Column(name = "CRD_IBFT_AVL")
    private Integer ibftAvl;

    @Column(name = "CRD_IBFT_LMT")
    private Integer ibftLmt;

    @Column(name = "CRD_IBFTDR_AVL")
    private Integer ibftdrAvl;

    @Column(name = "CRD_IBFTDR_LMT")
    private Integer ibftdrLmt;

    @Column(name = "CRD_BILL_AVL")
    private Integer billAvl;

    @Column(name = "CRD_BILL_LMT")
    private Integer billLmt;

    @Column(name = "CRD_FREETXN_AVL")
    private Integer freeTxnAvl;

    @Column(name = "CRD_FREETXN_LMT")
    private Integer freeTxnLmt;

    @Column(name = "CRD_PINRETRIES_LMT")
    private Integer pinRetriesLmt;

    @Column(name = "CRD_USE_AVL")
    private Integer useAvl;

    @Column(name = "CRD_USE_LMT")
    private Integer useLmt;

    @Column(name = "CRD_CARDSEQ")
    private Integer cardSeq;

    @Column(name = "CRD_ATC", length = 4)
    private String atc;

    @Column(name = "CRD_LANGCD", length = 1)
    private String langCd;

    @Column(name = "CRD_CHRGS_WAIVED", length = 1)
    private String chrgsWaived;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_PINISSUED_DT")
    private Date pinissuedDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LINK_DT")
    private Date linkDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_COLLECT_DT")
    private Date collectDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_CLOSE_DT")
    private Date closeDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LASTACCCHG_DT")
    private Date lastAccChgDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LASTACT_DT")
    private Date lastActDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LASTMAINT_DT")
    private Date lastMaintDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LASTSTSCHG_DT")
    private Date lastStsChgDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRD_LASTCYC_DT")
    private Date lastCycDt;

    public Date getLastCycDt() {
        return lastCycDt;
    }

    public void setLastCycDt(Date lastCycDt) {
        this.lastCycDt = lastCycDt;
    }

    public Date getLastStsChgDt() {
        return lastStsChgDt;
    }

    public void setLastStsChgDt(Date lastStsChgDt) {
        this.lastStsChgDt = lastStsChgDt;
    }

    public Date getLastMaintDt() {
        return lastMaintDt;
    }

    public void setLastMaintDt(Date lastMaintDt) {
        this.lastMaintDt = lastMaintDt;
    }

    public Date getLastActDt() {
        return lastActDt;
    }

    public void setLastActDt(Date lastActDt) {
        this.lastActDt = lastActDt;
    }

    public Date getLastAccChgDt() {
        return lastAccChgDt;
    }

    public void setLastAccChgDt(Date lastAccChgDt) {
        this.lastAccChgDt = lastAccChgDt;
    }

    public Date getCloseDt() {
        return closeDt;
    }

    public void setCloseDt(Date closeDt) {
        this.closeDt = closeDt;
    }

    public Date getCollectDt() {
        return collectDt;
    }

    public void setCollectDt(Date collectDt) {
        this.collectDt = collectDt;
    }

    public Date getLinkDt() {
        return linkDt;
    }

    public void setLinkDt(Date linkDt) {
        this.linkDt = linkDt;
    }

    public Date getPinissuedDt() {
        return pinissuedDt;
    }

    public void setPinissuedDt(Date pinissuedDt) {
        this.pinissuedDt = pinissuedDt;
    }

    public String getChrgsWaived() {
        return chrgsWaived;
    }

    public void setChrgsWaived(String chrgsWaived) {
        this.chrgsWaived = chrgsWaived;
    }

    public String getLangCd() {
        return langCd;
    }

    public void setLangCd(String langCd) {
        this.langCd = langCd;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public Integer getCardSeq() {
        return cardSeq;
    }

    public void setCardSeq(Integer cardSeq) {
        this.cardSeq = cardSeq;
    }

    public Integer getUseLmt() {
        return useLmt;
    }

    public void setUseLmt(Integer useLmt) {
        this.useLmt = useLmt;
    }

    public Integer getUseAvl() {
        return useAvl;
    }

    public void setUseAvl(Integer useAvl) {
        this.useAvl = useAvl;
    }

    public Integer getPinRetriesLmt() {
        return pinRetriesLmt;
    }

    public void setPinRetriesLmt(Integer pinRetriesLmt) {
        this.pinRetriesLmt = pinRetriesLmt;
    }

    public Integer getFreeTxnLmt() {
        return freeTxnLmt;
    }

    public void setFreeTxnLmt(Integer freeTxnLmt) {
        this.freeTxnLmt = freeTxnLmt;
    }

    public Integer getFreeTxnAvl() {
        return freeTxnAvl;
    }

    public void setFreeTxnAvl(Integer freeTxnAvl) {
        this.freeTxnAvl = freeTxnAvl;
    }

    public Integer getBillLmt() {
        return billLmt;
    }

    public void setBillLmt(Integer billLmt) {
        this.billLmt = billLmt;
    }

    public Integer getBillAvl() {
        return billAvl;
    }

    public void setBillAvl(Integer billAvl) {
        this.billAvl = billAvl;
    }

    public Integer getIbftdrLmt() {
        return ibftdrLmt;
    }

    public void setIbftdrLmt(Integer ibftdrLmt) {
        this.ibftdrLmt = ibftdrLmt;
    }

    public Integer getIbftdrAvl() {
        return ibftdrAvl;
    }

    public void setIbftdrAvl(Integer ibftdrAvl) {
        this.ibftdrAvl = ibftdrAvl;
    }

    public Integer getIbftLmt() {
        return ibftLmt;
    }

    public void setIbftLmt(Integer ibftLmt) {
        this.ibftLmt = ibftLmt;
    }

    public Integer getIbftAvl() {
        return ibftAvl;
    }

    public void setIbftAvl(Integer ibftAvl) {
        this.ibftAvl = ibftAvl;
    }

    public Integer getTrndrLmt() {
        return trndrLmt;
    }

    public void setTrndrLmt(Integer trndrLmt) {
        this.trndrLmt = trndrLmt;
    }

    public Integer getTrndrAvl() {
        return trndrAvl;
    }

    public void setTrndrAvl(Integer trndrAvl) {
        this.trndrAvl = trndrAvl;
    }

    public Integer getTrnLmt() {
        return trnLmt;
    }

    public void setTrnLmt(Integer trnLmt) {
        this.trnLmt = trnLmt;
    }

    public Integer getTrnAvl() {
        return trnAvl;
    }

    public void setTrnAvl(Integer trnAvl) {
        this.trnAvl = trnAvl;
    }

    public Integer getOffCshLmt() {
        return offCshLmt;
    }

    public void setOffCshLmt(Integer offCshLmt) {
        this.offCshLmt = offCshLmt;
    }

    public Integer getOffCshAvl() {
        return offCshAvl;
    }

    public void setOffCshAvl(Integer offCshAvl) {
        this.offCshAvl = offCshAvl;
    }

    public Integer getCshLmt() {
        return cshLmt;
    }

    public void setCshLmt(Integer cshLmt) {
        this.cshLmt = cshLmt;
    }

    public Integer getCshAvl() {
        return cshAvl;
    }

    public void setCshAvl(Integer cshAvl) {
        this.cshAvl = cshAvl;
    }

    public String getCollectType() {
        return collectType;
    }

    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }

    public String getExpYr() {
        return expYr;
    }

    public void setExpYr(String expYr) {
        this.expYr = expYr;
    }

    public String getExpMth() {
        return expMth;
    }

    public void setExpMth(String expMth) {
        this.expMth = expMth;
    }

    public String getPinSerialNo() {
        return pinSerialNo;
    }

    public void setPinSerialNo(String pinSerialNo) {
        this.pinSerialNo = pinSerialNo;
    }

    public String getPinOffset() {
        return pinOffset;
    }

    public void setPinOffset(String pinOffset) {
        this.pinOffset = pinOffset;
    }

    public Integer getPinRetriesCnt() {
        return pinRetriesCnt;
    }

    public void setPinRetriesCnt(Integer pinRetriesCnt) {
        this.pinRetriesCnt = pinRetriesCnt;
    }

    public String getEmbossNm() {
        return embossNm;
    }

    public void setEmbossNm(String embossNm) {
        this.embossNm = embossNm;
    }

    public Integer getCycPrd() {
        return cycPrd;
    }

    public void setCycPrd(Integer cycPrd) {
        this.cycPrd = cycPrd;
    }

    public Integer getCrdReturn() {
        return crdReturn;
    }

    public void setCrdReturn(Integer crdReturn) {
        this.crdReturn = crdReturn;
    }

    public Integer getIssued() {
        return issued;
    }

    public void setIssued(Integer issued) {
        this.issued = issued;
    }

    public String getClsType() {
        return clsType;
    }

    public void setClsType(String clsType) {
        this.clsType = clsType;
    }

    public String getCrdSts() {
        return crdSts;
    }

    public void setCrdSts(String crdSts) {
        this.crdSts = crdSts;
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

    public Integer getInstno() {
        return instno;
    }

    public void setInstno(Integer instno) {
        this.instno = instno;
    }
}