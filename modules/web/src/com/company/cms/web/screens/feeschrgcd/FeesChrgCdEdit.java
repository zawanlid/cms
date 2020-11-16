package com.company.cms.web.screens.feeschrgcd;

import com.company.cms.entity.model.ChrgCdTenorBy;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.FeesChrgCd;
import com.haulmont.cuba.web.gui.components.WebFieldGroup;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("cms_FeesChrgCd.edit")
@UiDescriptor("fees-chrg-cd-edit.xml")
@EditedEntityContainer("feesChrgCdDc")
@LoadDataBeforeShow
public class FeesChrgCdEdit extends StandardEditor<FeesChrgCd> {

    /**
     * Create a dynamic view based on ChrgCdTenorby Field Value.
     * @param event
     */
    @Subscribe("chrgCdTenorbyField")
    public void onChrgCdTenorbyFieldValueChange(HasValue.ValueChangeEvent<ChrgCdTenorBy> event) {
        if (event.getValue() != null) {
            getWindow().getComponent("chrgCdTenorby_flat_rate_detail").setVisible(event.getValue().getId().equals("F"));
            getWindow().getComponent("chrgCdTenorby_percentage_detail").setVisible(event.getValue().getId().equals("P"));
            getWindow().getComponent("chrgCdTenorby_fixed_rate_detail").setVisible(event.getValue().getId().equals("X"));
        } else {
            getWindow().getComponent("chrgCdTenorby_flat_rate_detail").setVisible(false);
            getWindow().getComponent("chrgCdTenorby_percentage_detail").setVisible(false);
            getWindow().getComponent("chrgCdTenorby_fixed_rate_detail").setVisible(false);
        }
    }

}