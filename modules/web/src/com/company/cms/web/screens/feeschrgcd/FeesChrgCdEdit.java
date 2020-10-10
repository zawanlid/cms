package com.company.cms.web.screens.feeschrgcd;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FeesChrgCd;

@UiController("cms_FeesChrgCd.edit")
@UiDescriptor("fees-chrg-cd-edit.xml")
@EditedEntityContainer("feesChrgCdDc")
@LoadDataBeforeShow
public class FeesChrgCdEdit extends StandardEditor<FeesChrgCd> {
}