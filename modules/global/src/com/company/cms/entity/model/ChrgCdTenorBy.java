package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum ChrgCdTenorBy implements EnumClass<String> {

    FIXED("F"),
    PERCENTAGE("P"),
    X("X");

    ChrgCdTenorBy(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static ChrgCdTenorBy fromId(String id) {
        for (ChrgCdTenorBy o : ChrgCdTenorBy.values()) {
            if (o.getId().equals(id))
                return o;
        }
        return null;
    }
}
