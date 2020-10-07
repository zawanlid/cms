package com.company.cms.web.screens.cardcond;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardCond;

@UiController("cms_CardCond.browse")
@UiDescriptor("card-cond-browse.xml")
@LookupComponent("cardCondsTable")
@LoadDataBeforeShow
public class CardCondBrowse extends StandardLookup<CardCond> {
}