package com.zms.listcard.events;

import com.zms.listcard.model.Card;

public class DismissEvent {

    private final Card dismissedCard;

    public DismissEvent(Card dismissedCard) {
        this.dismissedCard = dismissedCard;
    }

    public Card getDismissedCard() {
        return dismissedCard;
    }
}
