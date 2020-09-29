package com.company.cms.web.screens.filefmt;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FileFmt;

@UiController("cms_FileFmt.edit")
@UiDescriptor("file-fmt-edit.xml")
@EditedEntityContainer("fileFmtDc")
@LoadDataBeforeShow
public class FileFmtEdit extends StandardEditor<FileFmt> {
}