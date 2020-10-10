package com.company.cms.web.screens.customercrddet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdDet;

@UiController("cms_CustomerCrdDet.browse")
@UiDescriptor("customer-crd-det-browse.xml")
@LookupComponent("customerCrdDetsTable")
@LoadDataBeforeShow
public class CustomerCrdDetBrowse extends StandardLookup<CustomerCrdDet> {
}