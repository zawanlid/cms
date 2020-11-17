package com.company.cms.web.screens.fees;

import com.company.cms.entity.model.ChrgCd;
import com.company.cms.entity.model.ChrgCdTenorBy;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.Fees;

import java.math.BigDecimal;

@UiController("cms_Fees.edit")
@UiDescriptor("fees-edit.xml")
@EditedEntityContainer("feesDc")
@LoadDataBeforeShow
public class FeesEdit extends StandardEditor<Fees> {

    /**
     * Create a dynamic view based on ChrgCdTenorby Field Value.
     * @param event
     */
    @Subscribe("chrgsCdField")
    public void onChrgCdFieldValueChange(HasValue.ValueChangeEvent<ChrgCd> event) {
        if (event.getValue() != null) {
            getWindow().getComponent("fee_detail_1").setVisible(event.getValue().getId().equals("N"));
        } else {
            getWindow().getComponent("fee_detail_1").setVisible(false);
        }
    }


/*    @Subscribe("netFeeField")
    public void onNetFeeValueChange(InstanceContainer<Fees> event) { setTotalFee(event); }

    @Subscribe("issFeeField")
    public void onIssFeeValueChange(InstanceContainer<Fees> event) { setTotalFee(event); }

    @Subscribe("termFeeField")
    public void onTermFeeValueChange(InstanceContainer<Fees> event) { setTotalFee(event); }

    @Subscribe("bnbFeeField")
    public void onBnbFeeValueChange(InstanceContainer<Fees> event) { setTotalFee(event); }*/

    @Subscribe(id = "feesDc", target = Target.DATA_CONTAINER)
    private void onCustomerDcItemPropertyChange(
            InstanceContainer.ItemPropertyChangeEvent<Fees> event) {
        setTotalFee(event);
    }

    private void setTotalFee (InstanceContainer.ItemPropertyChangeEvent<Fees> event) {
        Integer netFee = getEditedEntity().getNetFee() != null ? getEditedEntity().getNetFee() : 0;
        Integer termFee = getEditedEntity().getTermFee() != null ? getEditedEntity().getTermFee() : 0;
        Integer issFee = getEditedEntity().getIssFee() != null ? getEditedEntity().getIssFee() : 0;
        Integer bnbFee = getEditedEntity().getBnbFee() != null ? getEditedEntity().getBnbFee() : 0;

        event.getItem().setTtlFee(BigDecimal.valueOf(netFee+termFee+issFee+bnbFee));
    }
}