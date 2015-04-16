package com.zms.listcard.cards.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.zms.listcard.cards.BigImageCard;

public class BigImageCardItemView<T extends BigImageCard> extends BaseTextCardItemView<T>{
    public BigImageCardItemView(Context context) {
        super(context);
    }

    public BigImageCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BigImageCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
