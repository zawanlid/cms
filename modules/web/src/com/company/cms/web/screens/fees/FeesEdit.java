package com.company.cms.web.screens.fees;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.Fees;

@UiController("cms_Fees.edit")
@UiDescriptor("fees-edit.xml")
@EditedEntityContainer("feesDc")
@LoadDataBeforeShow
public class FeesEdit extends StandardEditor<Fees> {
}