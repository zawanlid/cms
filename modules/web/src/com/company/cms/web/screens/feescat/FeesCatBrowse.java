package com.company.cms.web.screens.feescat;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FeesCat;

@UiController("cms_FeesCat.browse")
@UiDescriptor("fees-cat-browse.xml")
@LookupComponent("feesCatsTable")
@LoadDataBeforeShow
public class FeesCatBrowse extends StandardLookup<FeesCat> {
}