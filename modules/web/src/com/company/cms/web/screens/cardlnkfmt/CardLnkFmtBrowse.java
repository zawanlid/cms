package com.company.cms.web.screens.cardlnkfmt;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardLnkFmt;

@UiController("cms_CardLnkFmt.browse")
@UiDescriptor("card-lnk-fmt-browse.xml")
@LookupComponent("cardLnkFmtsTable")
@LoadDataBeforeShow
public class CardLnkFmtBrowse extends StandardLookup<CardLnkFmt> {
}