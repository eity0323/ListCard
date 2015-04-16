package com.zms.listcard.cards;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.zms.listcard.events.BusProvider;
import com.zms.listcard.model.Card;

public abstract class BasicCard extends Card {
    private final Context mContext;
    private int mBackgroundColor = Color.WHITE;

    public BasicCard(Context context) {
        mContext = context;
    }

    public void setBackgroundColor(int color) {
        mBackgroundColor = color;
        BusProvider.dataSetChanged();
    }

    public void setBackgroundColorRes(int colorId) {
        setBackgroundColor(getResources().getColor(colorId));
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    protected String getString(int id) {
        return mContext.getString(id);
    }

    protected Resources getResources() {
        return mContext.getResources();
    }
}
