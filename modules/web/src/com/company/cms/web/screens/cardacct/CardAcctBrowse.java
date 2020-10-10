package com.company.cms.web.screens.cardacct;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardAcct;

@UiController("cms_CardAcct.browse")
@UiDescriptor("card-acct-browse.xml")
@LookupComponent("cardAcctsTable")
@LoadDataBeforeShow
public class CardAcctBrowse extends StandardLookup<CardAcct> {
}