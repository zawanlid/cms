package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum ChrgCd implements EnumClass<String> {

    N("N"),
    Y("Y");

    ChrgCd(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static ChrgCd fromId(String id) {
        for (ChrgCd o : ChrgCd.values()) {
            if (o.getId().equals(id))
                return o;
        }
        return null;
    }
}
