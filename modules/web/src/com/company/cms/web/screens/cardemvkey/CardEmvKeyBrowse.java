package com.company.cms.web.screens.cardemvkey;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CardEmvKey;

@UiController("cms_CardEmvKey.browse")
@UiDescriptor("card-emv-key-browse.xml")
@LookupComponent("cardEmvKeysTable")
@LoadDataBeforeShow
public class CardEmvKeyBrowse extends StandardLookup<CardEmvKey> {
}