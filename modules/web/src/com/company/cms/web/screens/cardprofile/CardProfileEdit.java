package com.company.cms.web.screens.cardprofile;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfile;

@UiController("cms_CardProfile.edit")
@UiDescriptor("card-profile-edit.xml")
@EditedEntityContainer("cardProfileDc")
@LoadDataBeforeShow
public class CardProfileEdit extends StandardEditor<CardProfile> {
}