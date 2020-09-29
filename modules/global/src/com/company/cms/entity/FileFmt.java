package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CMSFILEFMT")
@Entity(name = "cms_FileFmt")
public class FileFmt extends StandardEntity {
    private static final long serialVersionUID = 6716323883886391566L;

    @Column(name = "INST_NO")
    private Integer instNo;

    @Column(name = "FMT_TYPE", length = 10)
    private String fmtType;

    @Column(name = "FMT_ID", length = 10)
    private String fmtId;

    @Column(name = "FIELD", length = 30)
    private String field;

    @Column(name = "DESCR", length = 50)
    private String descr;

    @Column(name = "POS")
    private Integer pos;

    @Column(name = "LENGTH")
    private Integer length;

    @Temporal(TemporalType.DATE)
    @Column(name = "LASTUPDATED")
    private Date lastUpdated;

    @Column(name = "LASTUPDATED_BY", length = 10)
    private String lastUpdatedBy;

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFmtId() {
        return fmtId;
    }

    public void setFmtId(String fmtId) {
        this.fmtId = fmtId;
    }

    public String getFmtType() {
        return fmtType;
    }

    public void setFmtType(String fmtType) {
        this.fmtType = fmtType;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }
}