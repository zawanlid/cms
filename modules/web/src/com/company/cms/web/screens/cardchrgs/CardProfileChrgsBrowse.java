package com.company.cms.web.screens.cardchrgs;

import com.company.cms.web.screens.brnmaintavlreq.BrnMaintAvlReqEdit;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardProfile;

import javax.inject.Named;

@UiController("cms_CardProfileChrgs.browse")
@UiDescriptor("card-profile-chrgs-browse.xml")
@LookupComponent("cardProfilesChrgsTable")
@LoadDataBeforeShow
public class CardProfileChrgsBrowse extends StandardLookup<CardProfile> {
    @Named("cardProfilesChrgsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(CardProfileChrgsEdit.class);
    }
}