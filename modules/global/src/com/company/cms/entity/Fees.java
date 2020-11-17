package com.company.cms.entity;

import com.company.cms.entity.model.ChrgCd;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "CMSFEES")
@Entity(name = "cms_Fees")
public class Fees extends StandardEntity {
    private static final long serialVersionUID = 5937573509111096483L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "TRNSCHL", length = 4)
    private String trnsChl;

    @Column(name = "EXTTRNCD", length = 9)
    private String extTrnCd;

    @Column(name = "CHRGSCD")
    private String chrgsCd;

    @Column(name = "CURR", length = 3)
    private String curr;

    @Column(name = "AUTHNM", length = 4)
    private String authNm;

    @Column(name = "CATLST", length = 500)
    private String catLst;

    @Column(name = "CHRGCDLST", length = 100)
    private String chrgCdLst;

    @Column(name = "PRIORITY", length = 3)
    private String priority;

    @Column(name = "NETFEE")
    private Integer netFee;

    @Column(name = "TERMFEE")
    private Integer termFee;

    @Column(name = "ISSFEE")
    private Integer issFee;

    @Column(name = "BNBFEE")
    private Integer bnbFee;

    @Column(name = "TTLCHG")
    private Integer ttlChg;

    @Column(name = "TRNDESCR", length = 100)
    private String trnDescr;

    @Column(name = "TTL_FEE")
    private BigDecimal ttlFee;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "feesList")
    private List<FeesCat> feesCatList;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "feesList")
    private List<FeesChrgCd> feesChrgCdList;

    public void setChrgsCd(ChrgCd chrgsCd) {
        this.chrgsCd = chrgsCd == null ? null : chrgsCd.getId();
    }

    public ChrgCd getChrgsCd() {
        return chrgsCd == null ? null : ChrgCd.fromId(chrgsCd);
    }

    public void setTtlFee(BigDecimal ttlFee) {
        this.ttlFee = ttlFee;
    }

    public String getTrnDescr() {
        return trnDescr;
    }

    public void setTrnDescr(String trnDescr) {
        this.trnDescr = trnDescr;
    }

    public Integer getTtlChg() {
        return ttlChg;
    }

    public void setTtlChg(Integer ttlChg) {
        this.ttlChg = ttlChg;
    }

    public Integer getBnbFee() {
        return bnbFee;
    }

    public void setBnbFee(Integer bnbFee) {
        this.bnbFee = bnbFee;
    }

    public Integer getIssFee() {
        return issFee;
    }

    public void setIssFee(Integer issFee) {
        this.issFee = issFee;
    }

    public Integer getTermFee() {
        return termFee;
    }

    public void setTermFee(Integer termFee) {
        this.termFee = termFee;
    }

    public Integer getNetFee() {
        return netFee;
    }

    public void setNetFee(Integer netFee) {
        this.netFee = netFee;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getChrgCdLst() {
        return chrgCdLst;
    }

    public void setChrgCdLst(String chrgCdLst) {
        this.chrgCdLst = chrgCdLst;
    }

    public String getCatLst() {
        return catLst;
    }

    public void setCatLst(String catLst) {
        this.catLst = catLst;
    }

    public String getAuthNm() {
        return authNm;
    }

    public void setAuthNm(String authNm) {
        this.authNm = authNm;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getExtTrnCd() {
        return extTrnCd;
    }

    public void setExtTrnCd(String extTrnCd) {
        this.extTrnCd = extTrnCd;
    }

    public String getTrnsChl() {
        return trnsChl;
    }

    public void setTrnsChl(String trnsChl) {
        this.trnsChl = trnsChl;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }

    public BigDecimal getTtlFee() {
        return ttlFee != null ? ttlFee : BigDecimal.valueOf(0);
    }

    public List<FeesCat> getFeesCatList() {
        return feesCatList;
    }

    public void setFeesCatList(List<FeesCat> feesCatList) {
        this.feesCatList = feesCatList;
    }
}