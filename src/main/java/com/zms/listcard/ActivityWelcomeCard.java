package com.zms.listcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zms.listcard.cards.OnButtonPressListener;
import com.zms.listcard.cards.SimpleCard;
import com.zms.listcard.cards.WelcomeCard;
import com.zms.listcard.controller.OnDismissCallback;
import com.zms.listcard.model.Card;
import com.zms.listcard.view.MaterialListView;

/**
 * Created by AlexZhou on 2015/4/16.
 * 10:58
 */
public class ActivityWelcomeCard extends Activity {
    private MaterialListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo);
        listView = (MaterialListView) findViewById(R.id.material_listview);
        for (int i = 0; i < 10; i++) {
            SimpleCard card;
            String title = "Welcome Card title-" + i;
            String description = "Welcome Card description-" + i;
            card = new WelcomeCard(this);
            card.setTitle(title);
            card.setDescription(description);
            ((WelcomeCard) card).setSubtitle("My subtitle!");
            ((WelcomeCard) card).setButtonText("Okay!");
            ((WelcomeCard) card).setOnButtonPressedListener(new OnButtonPressListener() {
                @Override
                public void onButtonPressedListener(View view, Card card) {
                    Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_SHORT).show();
                    listView.remove(card);
                }
            });

            if (i % 2 == 0)
                ((WelcomeCard) card).setBackgroundColorRes(R.color.background_material_dark);
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
}
