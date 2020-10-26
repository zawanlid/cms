package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum ClsType implements EnumClass<String> {

    Individual_Card   ("01")
    ;

    ClsType(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static ClsType fromId(String id) {
        for (ClsType clsType : ClsType.values()) {
            if (clsType.getId().equals(id))
                return clsType;
        }
        return null;
    }
}
