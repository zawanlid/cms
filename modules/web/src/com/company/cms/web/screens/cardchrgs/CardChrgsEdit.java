package com.company.cms.web.screens.cardchrgs;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardChrgs;

@UiController("cms_CardChrgs.edit")
@UiDescriptor("card-chrgs-edit.xml")
@EditedEntityContainer("cardChrgsDc")
@LoadDataBeforeShow
public class CardChrgsEdit extends StandardEditor<CardChrgs> {
}