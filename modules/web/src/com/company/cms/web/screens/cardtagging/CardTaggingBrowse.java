package com.company.cms.web.screens.cardtagging;

import com.company.cms.web.screens.cardrnwrplct.CardRnwRplctEdit;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

import javax.inject.Named;

@UiController("cms_CardTagging.browse")
@UiDescriptor("card-tagging-browse.xml")
@LookupComponent("cardDetsTable")
@LoadDataBeforeShow
public class CardTaggingBrowse extends StandardLookup<CardDet> {
    @Named("cardDetsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(CardTaggingEdit.class);
    }
}