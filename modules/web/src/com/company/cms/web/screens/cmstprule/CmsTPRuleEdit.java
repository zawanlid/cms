package com.company.cms.web.screens.cmstprule;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsTPRule;

@UiController("cms_CmsTPRule.edit")
@UiDescriptor("cms-tp-rule-edit.xml")
@EditedEntityContainer("cmsTPRuleDc")
@LoadDataBeforeShow
public class CmsTPRuleEdit extends StandardEditor<CmsTPRule> {
}