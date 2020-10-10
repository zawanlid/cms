package com.company.cms.web.screens.carddet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

@UiController("cms_CardDet.browse")
@UiDescriptor("card-det-browse.xml")
@LookupComponent("cardDetsTable")
@LoadDataBeforeShow
public class CardDetBrowse extends StandardLookup<CardDet> {
}