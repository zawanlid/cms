package com.company.cms.web.screens.brnmaint;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.BrnMaint;

@UiController("cms_BrnMaint.edit")
@UiDescriptor("brn-maint-edit.xml")
@EditedEntityContainer("brnMaintDc")
@LoadDataBeforeShow
public class BrnMaintEdit extends StandardEditor<BrnMaint> {
}