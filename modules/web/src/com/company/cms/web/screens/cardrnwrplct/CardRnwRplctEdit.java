package com.company.cms.web.screens.cardrnwrplct;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

@UiController("cms_CardRnwRplct.edit")
@UiDescriptor("card-rnw-rplct-edit.xml")
@EditedEntityContainer("cardDetDc")
@LoadDataBeforeShow
public class CardRnwRplctEdit extends StandardEditor<CardDet> {
}