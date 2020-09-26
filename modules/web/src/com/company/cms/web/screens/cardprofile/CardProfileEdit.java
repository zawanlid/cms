package com.company.cms.web.screens.cardprofile;

import com.company.cms.entity.CardProfile;
import com.haulmont.cuba.gui.screen.*;

@UiController("cms_CardProfile.edit")
@UiDescriptor("card-profile-edit.xml")
@EditedEntityContainer("cardProfileDc")
@LoadDataBeforeShow
public class CardProfileEdit extends StandardEditor<CardProfile> {

}