package com.company.cms.web.screens.cardembossreq;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardGenReq;

@UiController("cms_CardEmbossReq.edit")
@UiDescriptor("card-emboss-req-edit.xml")
@EditedEntityContainer("cardEmbossReqDc")
@LoadDataBeforeShow
public class CardEmbossReqEdit extends StandardEditor<CardGenReq> {
}