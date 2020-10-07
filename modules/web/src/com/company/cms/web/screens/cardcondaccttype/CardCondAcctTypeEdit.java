package com.company.cms.web.screens.cardcondaccttype;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardCondAcctType;

@UiController("cms_CardCondAcctType.edit")
@UiDescriptor("card-cond-acct-type-edit.xml")
@EditedEntityContainer("cardCondAcctTypeDc")
@LoadDataBeforeShow
public class CardCondAcctTypeEdit extends StandardEditor<CardCondAcctType> {
}