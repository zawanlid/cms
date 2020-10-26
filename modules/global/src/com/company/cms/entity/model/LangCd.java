package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum LangCd implements EnumClass<String> {

    English("1"),
    Malay("2"),
    Chinese("3");

    LangCd(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static LangCd fromId(String id) {
        for (LangCd langCd : LangCd.values()) {
            if (langCd.getId().equals(id))
                return langCd;
        }
        return null;
    }
}
