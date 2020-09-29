package com.company.cms.web.screens.brnmaint;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.BrnMaint;

@UiController("cms_BrnMaint.browse")
@UiDescriptor("brn-maint-browse.xml")
@LookupComponent("brnMaintsTable")
@LoadDataBeforeShow
public class BrnMaintBrowse extends StandardLookup<BrnMaint> {
}