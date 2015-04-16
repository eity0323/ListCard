package com.zms.listcard.cards;

import android.content.Context;
import com.zms.listcard.R;

public class BasicImageButtonsCard extends ExtendedCard {
    public BasicImageButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_image_buttons_card_layout;
    }

}
