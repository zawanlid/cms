package com.company.cms.web.screens.cardgenreqdet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardGenReqDet;

@UiController("cms_CardGenReqDet.edit")
@UiDescriptor("card-gen-req-det-edit.xml")
@EditedEntityContainer("cardGenReqDetDc")
@LoadDataBeforeShow
public class CardGenReqDetEdit extends StandardEditor<CardGenReqDet> {
}