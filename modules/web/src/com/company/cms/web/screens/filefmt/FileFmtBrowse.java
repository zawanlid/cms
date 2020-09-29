package com.company.cms.web.screens.filefmt;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FileFmt;

@UiController("cms_FileFmt.browse")
@UiDescriptor("file-fmt-browse.xml")
@LookupComponent("fileFmtsTable")
@LoadDataBeforeShow
public class FileFmtBrowse extends StandardLookup<FileFmt> {
}