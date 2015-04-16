package com.zms.listcard.controller;

import com.zms.listcard.model.Card;

public interface OnDismissCallback {
    void onDismiss(Card card, int position);
}
