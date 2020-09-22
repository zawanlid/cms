package com.company.cms.web.screens.cardprofile;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfile;

@UiController("cms_CardProfile.browse")
@UiDescriptor("card-profile-browse.xml")
@LookupComponent("cardProfilesTable")
@LoadDataBeforeShow
public class CardProfileBrowse extends StandardLookup<CardProfile> {
}