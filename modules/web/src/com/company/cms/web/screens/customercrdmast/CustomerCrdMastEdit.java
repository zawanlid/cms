package com.company.cms.web.screens.customercrdmast;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CustomerCrdMast;

@UiController("cms_CustomerCrdMast.edit")
@UiDescriptor("customer-crd-mast-edit.xml")
@EditedEntityContainer("customerCrdMastDc")
@LoadDataBeforeShow
public class CustomerCrdMastEdit extends StandardEditor<CustomerCrdMast> {
}