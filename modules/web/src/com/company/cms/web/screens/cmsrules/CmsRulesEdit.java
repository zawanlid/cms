package com.company.cms.web.screens.cmsrules;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsRules;

@UiController("cms_CmsRules.edit")
@UiDescriptor("cms-rules-edit.xml")
@EditedEntityContainer("cmsRulesDc")
@LoadDataBeforeShow
public class CmsRulesEdit extends StandardEditor<CmsRules> {
}