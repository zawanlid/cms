package com.company.cms.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CMSCRDCOND")
@Entity(name = "cms_CardCond")
public class CardCond extends StandardEntity {
    private static final long serialVersionUID = 8011990824231906445L;

    @Column(name = "INSTNO")
    private Integer instNo;

    @Column(name = "BIN", length = 10)
    private String bin;

    @Column(name = "BIN_MAX_ACCTS", length = 4)
    private String binMaxAcct;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "cardCond")
    private List<CardCondAcctType> cardCondAcctTypes;

    public String getBinMaxAcct() {
        return binMaxAcct;
    }

    public void setBinMaxAcct(String binMaxAcct) {
        this.binMaxAcct = binMaxAcct;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }

    public List<CardCondAcctType> getCardCondAcctTypes() {
        return cardCondAcctTypes;
    }

    public void setCardCondAcctTypes(List<CardCondAcctType> cardCondAcctTypes) {
        this.cardCondAcctTypes = cardCondAcctTypes;
    }
}