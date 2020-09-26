package com.company.cms.core;

import com.company.cms.entity.CardProfile;
import com.haulmont.cuba.core.app.events.EntityPersistingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component("cms_CardProfileEventListener")
public class CardProfileEventListener {


    /**
     * This event listener is to set BIN value from card profile to detail entities.
     * @param event
     */
    @EventListener
    void beforePersist(EntityPersistingEvent<CardProfile> event) {
        CardProfile cardProfile = event.getEntity();
        cardProfile.getCardEmvKey().setBin(cardProfile.getBin());
        cardProfile.getCardProfileDet().setBin(cardProfile.getBin());
    }

}
