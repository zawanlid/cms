package com.company.cms.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

public enum MailerType implements EnumClass<Integer> {

    ONE_UP   (1)
    ;

    MailerType(Integer id) {
        this.id = id;
    }

    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    public static MailerType fromId(Integer id) {
        for (MailerType mailerType : MailerType.values()) {
            if (mailerType.getId().equals(id))
                return mailerType;
        }
        return null;
    }
}
