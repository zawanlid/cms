package com.company.cms.web.screens.pinmailerreq;


import com.company.cms.entity.CardGenReq;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Named;

@UiController("cms_PinMailerReq.browse")
@UiDescriptor("pin-mailer-req-browse.xml")
@LookupComponent("pinMailerReqsTable")
@LoadDataBeforeShow
public class PinMailerReqBrowse extends StandardLookup<CardGenReq> {

    @Named("pinMailerReqsTable.create")
    private CreateAction createAction;

    @Named("pinMailerReqsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {
        createAction.setOpenMode(OpenMode.THIS_TAB);
        createAction.setScreenClass(PinMailerReqEdit.class);

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(PinMailerReqEdit.class);
    }


}