package com.company.cms.web.screens.cmstrans;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.CmsTrans;

@UiController("cms_CmsTrans.edit")
@UiDescriptor("cms-trans-edit.xml")
@EditedEntityContainer("cmsTransDc")
@LoadDataBeforeShow
public class CmsTransEdit extends StandardEditor<CmsTrans> {
}