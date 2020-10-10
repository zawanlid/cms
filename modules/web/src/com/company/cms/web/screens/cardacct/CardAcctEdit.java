package com.company.cms.web.screens.cardacct;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardAcct;

@UiController("cms_CardAcct.edit")
@UiDescriptor("card-acct-edit.xml")
@EditedEntityContainer("cardAcctDc")
@LoadDataBeforeShow
public class CardAcctEdit extends StandardEditor<CardAcct> {
}