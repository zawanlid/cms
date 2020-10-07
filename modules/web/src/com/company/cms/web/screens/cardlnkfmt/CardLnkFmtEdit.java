package com.company.cms.web.screens.cardlnkfmt;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardLnkFmt;

@UiController("cms_CardLnkFmt.edit")
@UiDescriptor("card-lnk-fmt-edit.xml")
@EditedEntityContainer("cardLnkFmtDc")
@LoadDataBeforeShow
public class CardLnkFmtEdit extends StandardEditor<CardLnkFmt> {
}