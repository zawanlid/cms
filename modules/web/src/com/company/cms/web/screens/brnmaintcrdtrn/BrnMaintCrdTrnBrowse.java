package com.company.cms.web.screens.brnmaintcrdtrn;

import com.company.cms.web.screens.brnmaintavlreq.BrnMaintAvlReqEdit;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.BrnMaint;

import javax.inject.Named;

@UiController("cms_BrnMaintCrdTrn.browse")
@UiDescriptor("brn-maint-crd-trn-browse.xml")
@LookupComponent("brnMaintsTable")
@LoadDataBeforeShow
public class BrnMaintCrdTrnBrowse extends StandardLookup<BrnMaint> {

    @Named("brnMaintCrdTrnsTable.edit")
    private EditAction editAction;

    @Subscribe
    public void onInit(InitEvent event) {

        editAction.setOpenMode(OpenMode.THIS_TAB);
        editAction.setScreenClass(BrnMaintCrdTrnEdit.class);
    }
}