package com.company.cms.entity.model;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.datatypes.impl.EnumClass;

@NamePattern("%s|id")
public enum CardStatus implements EnumClass<String> {

    ACTIVE   ("AC"),
    CLOSED   ("CL"),
    NEW      ("NW"),
    HOT      ("HT"),
    STOLEN   ("ST"),
    LOST     ("LS"),
    REVOKED  ("RV"),
    BLOCKED  ("BL"),
    INACTIVE ("IN")
    ;

    CardStatus(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public static CardStatus fromId(String id) {
        for (CardStatus cardStatus : CardStatus.values()) {
            if (cardStatus.getId().equals(id))
                return cardStatus;
        }
        return null;
    }
}
