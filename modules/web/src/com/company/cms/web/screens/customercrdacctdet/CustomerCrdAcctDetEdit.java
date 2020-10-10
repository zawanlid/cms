package com.company.cms.web.screens.customercrdacctdet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdAcctDet;

@UiController("cms_CustomerCrdAcctDet.edit")
@UiDescriptor("customer-crd-acct-det-edit.xml")
@EditedEntityContainer("customerCrdAcctDetDc")
@LoadDataBeforeShow
public class CustomerCrdAcctDetEdit extends StandardEditor<CustomerCrdAcctDet> {
}