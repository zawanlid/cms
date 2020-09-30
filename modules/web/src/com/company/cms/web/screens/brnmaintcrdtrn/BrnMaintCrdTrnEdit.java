package com.company.cms.web.screens.brnmaintcrdtrn;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.BrnMaint;

@UiController("cms_BrnMaintCrdTrn.edit")
@UiDescriptor("brn-maint-crd-trn-edit.xml")
@EditedEntityContainer("brnMaintCrdTrnDc")
@LoadDataBeforeShow
public class BrnMaintCrdTrnEdit extends StandardEditor<BrnMaint> {
}