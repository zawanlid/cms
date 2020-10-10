package com.company.cms.web.screens.carddet;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

@UiController("cms_CardDet.edit")
@UiDescriptor("card-det-edit.xml")
@EditedEntityContainer("cardDetDc")
@LoadDataBeforeShow
public class CardDetEdit extends StandardEditor<CardDet> {
}