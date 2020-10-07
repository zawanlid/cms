package com.company.cms.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Table(name = "CMSCRDEMVKEY")
@Entity(name = "cms_CardEmvKey")
@NamePattern("%s|binAppid")
public class CardEmvKey extends StandardEntity {
    private static final long serialVersionUID = 951044704825777276L;

    @Column(name = "BIN", nullable = false, unique = true, length = 10)
    @NotNull
    private String bin;

    @Column(name = "BIN_APPID", nullable = false, length = 12)
    @NotNull
    private String binAppid;

    @Column(name = "BIN_KEYNM", length = 30)
    private String binKeynm;

    @Column(name = "BIN_KEYVAL", length = 49)
    private String binKeyval;

    @Column(name = "BIN_KCV", length = 8)
    private String binKcv;

    @Column(name = "BIN_KEYSCH", length = 1)
    private String binKeysch;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIN_SAVEDT")
    private Date binSavedt;

    public Date getBinSavedt() {
        return binSavedt;
    }

    public void setBinSavedt(Date binSavedt) {
        this.binSavedt = binSavedt;
    }

    public String getBinKeysch() {
        return binKeysch;
    }

    public void setBinKeysch(String binKeysch) {
        this.binKeysch = binKeysch;
    }

    public String getBinKcv() {
        return binKcv;
    }

    public void setBinKcv(String binKcv) {
        this.binKcv = binKcv;
    }

    public String getBinKeyval() {
        return binKeyval;
    }

    public void setBinKeyval(String binKeyval) {
        this.binKeyval = binKeyval;
    }

    public String getBinKeynm() {
        return binKeynm;
    }

    public void setBinKeynm(String binKeynm) {
        this.binKeynm = binKeynm;
    }

    public String getBinAppid() {
        return binAppid;
    }

    public void setBinAppid(String binAppid) {
        this.binAppid = binAppid;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}