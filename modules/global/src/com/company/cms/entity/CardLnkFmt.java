package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSCRDLNKFMT")
@Entity(name = "cms_CardLnkFmt")
public class CardLnkFmt extends StandardEntity {
    private static final long serialVersionUID = 8133750036219612026L;

    @Column(name = "FMTID", length = 10)
    private String fmtID;

    @Column(name = "FIELD", length = 20)
    private String field;

    @Column(name = "DESCR", length = 50)
    private String descr;

    @Column(name = "POS")
    private Integer pos;

    @Column(name = "LENGTH")
    private Integer length;

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

    public String getFmtID() {
        return fmtID;
    }

    public void setFmtID(String fmtID) {
        this.fmtID = fmtID;
    }
}