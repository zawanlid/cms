package com.company.cms.web.screens.feeschrgcd;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FeesChrgCd;

@UiController("cms_FeesChrgCd.browse")
@UiDescriptor("fees-chrg-cd-browse.xml")
@LookupComponent("feesChrgCdsTable")
@LoadDataBeforeShow
public class FeesChrgCdBrowse extends StandardLookup<FeesChrgCd> {
}