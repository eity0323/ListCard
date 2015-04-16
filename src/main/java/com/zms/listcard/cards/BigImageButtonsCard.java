package com.zms.listcard.cards;

import android.content.Context;

import com.zms.listcard.R;

public class BigImageButtonsCard extends ExtendedCard {
    public BigImageButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_image_with_buttons_card;
    }
}
