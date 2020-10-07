package com.company.cms.web.screens.cardcond;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardCond;

@UiController("cms_CardCond.edit")
@UiDescriptor("card-cond-edit.xml")
@EditedEntityContainer("cardCondDc")
@LoadDataBeforeShow
public class CardCondEdit extends StandardEditor<CardCond> {
}