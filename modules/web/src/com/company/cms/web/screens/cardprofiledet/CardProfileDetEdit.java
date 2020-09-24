package com.company.cms.web.screens.cardprofiledet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfileDet;

@UiController("cms_CardProfileDet.edit")
@UiDescriptor("card-profile-det-edit.xml")
@EditedEntityContainer("cardProfileDetDc")
@LoadDataBeforeShow
public class CardProfileDetEdit extends StandardEditor<CardProfileDet> {
}