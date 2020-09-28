package com.company.cms.web.screens.cardembossreq;

import com.company.cms.web.screens.pinmailerreq.PinMailerReqEdit;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardGenReq;

import javax.inject.Named;

@UiController("cms_CardEmbossReq.browse")
@UiDescriptor("card-emboss-req-browse.xml")
@LookupComponent("cardEmbossReqTable")
@LoadDataBeforeShow
public class CardEmbossReqBrowse extends StandardLookup<CardGenReq> {

    @Named("cardEmbossReqTable.create")
    private CreateAction createAction;

    @Named("cardEmbossReqTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {
        createAction.setOpenMode(OpenMode.THIS_TAB);
        createAction.setScreenClass(CardEmbossReqEdit.class);

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(CardEmbossReqEdit.class);
    }

}