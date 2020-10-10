package com.company.cms.web.screens.customercrdacctdet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdAcctDet;

@UiController("cms_CustomerCrdAcctDet.browse")
@UiDescriptor("customer-crd-acct-det-browse.xml")
@LookupComponent("customerCrdAcctDetsTable")
@LoadDataBeforeShow
public class CustomerCrdAcctDetBrowse extends StandardLookup<CustomerCrdAcctDet> {
}