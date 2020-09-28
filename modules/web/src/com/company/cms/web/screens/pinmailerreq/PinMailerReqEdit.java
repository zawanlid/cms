package com.company.cms.web.screens.pinmailerreq;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardGenReq;

@UiController("cms_PinMailerReq.edit")
@UiDescriptor("pin-mailer-req-edit.xml")
@EditedEntityContainer("pinMailerReqDc")
@LoadDataBeforeShow
public class PinMailerReqEdit extends StandardEditor<CardGenReq> {
}