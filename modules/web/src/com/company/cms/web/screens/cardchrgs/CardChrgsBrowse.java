package com.company.cms.web.screens.cardchrgs;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardChrgs;

@UiController("cms_CardChrgs.browse")
@UiDescriptor("card-chrgs-browse.xml")
@LookupComponent("cardChrgsesTable")
@LoadDataBeforeShow
public class CardChrgsBrowse extends StandardLookup<CardChrgs> {
}