package com.company.cms.web.screens.cardrnwrplct;

import com.company.cms.web.screens.brnmaintavlreq.BrnMaintAvlReqEdit;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

import javax.inject.Named;

@UiController("cms_CardRnwRplct.browse")
@UiDescriptor("card-rnw-rplct-browse.xml")
@LookupComponent("cardDetsTable")
@LoadDataBeforeShow
public class CardRnwRplctBrowse extends StandardLookup<CardDet> {
    @Named("cardDetsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(CardRnwRplctEdit.class);
    }
}