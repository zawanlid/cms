package com.company.cms.web.screens.feescat;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FeesCat;

@UiController("cms_FeesCat.edit")
@UiDescriptor("fees-cat-edit.xml")
@EditedEntityContainer("feesCatDc")
@LoadDataBeforeShow
public class FeesCatEdit extends StandardEditor<FeesCat> {
}