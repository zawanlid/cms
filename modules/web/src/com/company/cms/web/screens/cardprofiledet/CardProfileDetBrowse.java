package com.company.cms.web.screens.cardprofiledet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfileDet;

@UiController("cms_CardProfileDet.browse")
@UiDescriptor("card-profile-det-browse.xml")
@LookupComponent("cardProfileDetsTable")
@LoadDataBeforeShow
public class CardProfileDetBrowse extends StandardLookup<CardProfileDet> {
}