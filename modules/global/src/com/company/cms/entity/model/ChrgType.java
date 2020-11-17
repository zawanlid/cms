package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum ChrgType implements EnumClass<String> {

    Network("N"),
    Terminal("T"),
    Issuer("I"),
    Beneficiary("B");

    ChrgType(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static ChrgType fromId(String id) {
        for (ChrgType o : ChrgType.values()) {
            if (o.getId().equals(id))
                return o;
        }
        return null;
    }
}
