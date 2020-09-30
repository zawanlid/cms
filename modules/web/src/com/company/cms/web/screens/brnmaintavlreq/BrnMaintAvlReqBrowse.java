package com.company.cms.web.screens.brnmaintavlreq;

import com.company.cms.entity.BrnMaint;
import com.company.cms.web.screens.pinmailerreq.PinMailerReqEdit;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Named;

@UiController("cms_BrnMaintAvlReq.browse")
@UiDescriptor("brn-maint-avl-req-browse.xml")
@LookupComponent("brnMaintsTable")
@LoadDataBeforeShow
public class BrnMaintAvlReqBrowse extends StandardLookup<BrnMaint> {

    @Named("brnMaintAvlReqsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(BrnMaintAvlReqEdit.class);
    }

}