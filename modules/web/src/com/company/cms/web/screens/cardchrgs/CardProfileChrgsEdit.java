package com.company.cms.web.screens.cardchrgs;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfile;

@UiController("cms_CardProfileChrgs.edit")
@UiDescriptor("card-profile-chrgs-edit.xml")
@EditedEntityContainer("cardProfileDc")
@LoadDataBeforeShow
public class CardProfileChrgsEdit extends StandardEditor<CardProfile> {
}