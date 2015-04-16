package com.zms.listcard;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.zms.listcard.cards.BigImageButtonsCard;
import com.zms.listcard.cards.OnButtonPressListener;
import com.zms.listcard.cards.SimpleCard;
import com.zms.listcard.controller.OnDismissCallback;
import com.zms.listcard.model.Card;
import com.zms.listcard.view.MaterialListView;

/**
 * Created by AlexZhou on 2015/4/16.
 * 11:23
 */
public class ActivityBigImageButtonCard extends Activity {
    private MaterialListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo);


        listView = (MaterialListView) findViewById(R.id.material_listview);
        for (int i = 0; i < 10; i++) {
            SimpleCard card;
            String title = "Basic List Card title-" + i;
            String description = "Basic List Card description-" + i;

            card = new BigImageButtonsCard(this);
            card.setDescription(description);
            card.setTitle(title);
            card.setDrawable(R.drawable.photo);
            ((BigImageButtonsCard) card).setLeftButtonText("ADD CARD");
            ((BigImageButtonsCard) card).setRightButtonText("RIGHT BUTTON");

            if (i % 2 == 0) {
                ((BigImageButtonsCard) card).setDividerVisible(true);
            }

            ((BigImageButtonsCard) card).setOnLeftButtonPressedListener(new OnButtonPressListener() {
                @Override
                public void onButtonPressedListener(View view, Card card) {
                    Log.d("ADDING", "CARD");

                    listView.add(generateNewCard());
                    Toast.makeText(getApplicationContext(), "Added new card", Toast.LENGTH_SHORT).show();
                }
            });

            ((BigImageButtonsCard) card).setOnRightButtonPressedListener(new OnButtonPressListener() {
                @Override
                public void onButtonPressedListener(View view, Card card) {
                    Toast.makeText(getApplicationContext(), "You have pressed the right button", Toast.LENGTH_SHORT).show();
                }
            });
            card.setDismissible(true);
            listView.add(card);
        }

        listView.setOnDismissCallback(new OnDismissCallback() {
            @Override
            public void onDismiss(Card card, int position) {
                Toast.makeText(getApplicationContext(), "CARD NUMBER " + position + " dismissed",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    private Card generateNewCard() {
        SimpleCard card = new BigImageButtonsCard(this);
        card.setDrawable(R.drawable.dog);
        card.setTitle("I'm new");
        card.setDescription("I've been generated on runtime!");
        ((BigImageButtonsCard) card).setLeftButtonText("ADD CARD");
        ((BigImageButtonsCard) card).setRightButtonText("RIGHT BUTTON");

        return card;
    }
}
