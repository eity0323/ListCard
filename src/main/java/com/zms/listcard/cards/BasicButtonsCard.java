package com.zms.listcard.cards;

import android.content.Context;

import com.zms.listcard.R;


public class BasicButtonsCard extends ExtendedCard {
    public BasicButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        // ZMS:Something wrong in layout files,
        // maybe the libs is not correct, Find it!!!
        return R.layout.material_basic_buttons_card;
    }

}
