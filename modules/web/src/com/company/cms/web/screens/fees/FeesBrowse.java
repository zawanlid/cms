package com.company.cms.web.screens.fees;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.Fees;

@UiController("cms_Fees.browse")
@UiDescriptor("fees-browse.xml")
@LookupComponent("feesesTable")
@LoadDataBeforeShow
public class FeesBrowse extends StandardLookup<Fees> {
}