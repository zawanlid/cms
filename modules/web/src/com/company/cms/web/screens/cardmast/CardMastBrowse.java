package com.company.cms.web.screens.cardmast;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardMast;

@UiController("cms_CardMast.browse")
@UiDescriptor("card-mast-browse.xml")
@LookupComponent("cardMastsTable")
@LoadDataBeforeShow
public class CardMastBrowse extends StandardLookup<CardMast> {
}