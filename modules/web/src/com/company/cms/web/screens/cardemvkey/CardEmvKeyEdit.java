package com.company.cms.web.screens.cardemvkey;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardEmvKey;

@UiController("cms_CardEmvKey.edit")
@UiDescriptor("card-emv-key-edit.xml")
@EditedEntityContainer("cardEmvKeyDc")
@LoadDataBeforeShow
public class CardEmvKeyEdit extends StandardEditor<CardEmvKey> {
}