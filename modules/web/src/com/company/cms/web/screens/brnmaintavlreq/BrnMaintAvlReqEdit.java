package com.company.cms.web.screens.brnmaintavlreq;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.BrnMaint;

@UiController("cms_BrnMaintAvlReq.edit")
@UiDescriptor("brn-maint-avl-req-edit.xml")
@EditedEntityContainer("brnMaintAvlReqDc")
@LoadDataBeforeShow
public class BrnMaintAvlReqEdit extends StandardEditor<BrnMaint> {
}