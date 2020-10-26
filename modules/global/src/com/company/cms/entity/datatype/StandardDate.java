package com.company.cms.entity.datatype;

import com.google.common.base.Strings;
import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.Datatype;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@JavaClass(Date.class)
public class StandardDate implements Datatype <Date> {

    private static final String PATTERN = "MMMM dd, yyyy";

    @Override
    public String format(@Nullable Object value) {
        if (value == null)
            return "";

        SimpleDateFormat format = new SimpleDateFormat(PATTERN);
        return format.format(value);
    }

    @Override
    public String format(@Nullable Object value, Locale locale) {
        return format(value);
    }

    @Nullable
    @Override
    public Date parse(@Nullable String value) throws ParseException {
        if (Strings.isNullOrEmpty(value))
            return null;
        SimpleDateFormat format = new SimpleDateFormat(PATTERN);
        return format.parse(value);
    }

    @Nullable
    @Override
    public Date parse(@Nullable String value, Locale locale) throws ParseException {
        return parse(value);
    }
}
