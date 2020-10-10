package com.company.cms.web.screens.cmstrans;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsTrans;

@UiController("cms_CmsTrans.browse")
@UiDescriptor("cms-trans-browse.xml")
@LookupComponent("cmsTransesTable")
@LoadDataBeforeShow
public class CmsTransBrowse extends StandardLookup<CmsTrans> {
}