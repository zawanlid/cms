package com.company.cms.web.screens.cmstprule;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsTPRule;

@UiController("cms_CmsTPRule.browse")
@UiDescriptor("cms-tp-rule-browse.xml")
@LookupComponent("cmsTPRulesTable")
@LoadDataBeforeShow
public class CmsTPRuleBrowse extends StandardLookup<CmsTPRule> {
}