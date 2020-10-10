package com.company.cms.web.screens.cardmast;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardMast;

@UiController("cms_CardMast.edit")
@UiDescriptor("card-mast-edit.xml")
@EditedEntityContainer("cardMastDc")
@LoadDataBeforeShow
public class CardMastEdit extends StandardEditor<CardMast> {
}