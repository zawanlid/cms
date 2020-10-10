package com.company.cms.web.screens.cmsrules;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsRules;

@UiController("cms_CmsRules.browse")
@UiDescriptor("cms-rules-browse.xml")
@LookupComponent("cmsRulesesTable")
@LoadDataBeforeShow
public class CmsRulesBrowse extends StandardLookup<CmsRules> {
}