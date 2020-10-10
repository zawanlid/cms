package com.company.cms.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CMSFEES_CAT")
@Entity(name = "cms_FeesCat")
public class FeesCat extends StandardEntity {
    private static final long serialVersionUID = -6233859171267535561L;

    @Column(name = "CATTYPE", length = 4)
    private String catType;

    @Column(name = "CATVAL", length = 4)
    private String catVal;

    @Column(name = "CATDESCR", length = 100)
    private String catDescr;

    public String getCatDescr() {
        return catDescr;
    }

    public void setCatDescr(String catDescr) {
        this.catDescr = catDescr;
    }

    public String getCatVal() {
        return catVal;
    }

    public void setCatVal(String catVal) {
        this.catVal = catVal;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}