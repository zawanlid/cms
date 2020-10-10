package com.company.cms.web.screens.customercrdmast;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdMast;

@UiController("cms_CustomerCrdMast.browse")
@UiDescriptor("customer-crd-mast-browse.xml")
@LookupComponent("customerCrdMastsTable")
@LoadDataBeforeShow
public class CustomerCrdMastBrowse extends StandardLookup<CustomerCrdMast> {
}