package com.company.cms.web.screens.cardtagging;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardDet;

@UiController("cms_CardTagging.edit")
@UiDescriptor("card-tagging-edit.xml")
@EditedEntityContainer("cardDetDc")
@LoadDataBeforeShow
public class CardTaggingEdit extends StandardEditor<CardDet> {
}