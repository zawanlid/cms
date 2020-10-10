package com.company.cms.web.screens.customercrddet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdDet;

@UiController("cms_CustomerCrdDet.edit")
@UiDescriptor("customer-crd-det-edit.xml")
@EditedEntityContainer("customerCrdDetDc")
@LoadDataBeforeShow
public class CustomerCrdDetEdit extends StandardEditor<CustomerCrdDet> {
}