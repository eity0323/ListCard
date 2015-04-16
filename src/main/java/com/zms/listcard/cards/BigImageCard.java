package com.zms.listcard.cards;

import android.content.Context;

import com.zms.listcard.R;

public class BigImageCard extends SimpleCard {
    public BigImageCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_big_image_card_layout;
    }
}
