package com.zms.listcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zms.listcard.cards.BasicImageButtonsCard;
import com.zms.listcard.cards.OnButtonPressListener;
import com.zms.listcard.cards.SimpleCard;
import com.zms.listcard.cards.SmallImageCard;
import com.zms.listcard.controller.OnDismissCallback;
import com.zms.listcard.model.Card;
import com.zms.listcard.view.MaterialListView;

/**
 * Created by AlexZhou on 2015/4/16.
 * 10:51
 */
public class ActivityBasicImageButtonCard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo);

        final MaterialListView listView = (MaterialListView) findViewById(R.id.material_listview);
        for (int i = 0; i < 10; i++) {
            SimpleCard card;
            String title = "Basic Image Button Card title-" + i;
            String description = "Basic Image Button Card description-" + i;
            card = new BasicImageButtonsCard(this);
            card.setDescription(description);
            card.setTitle(title);
            card.setDrawable(R.drawable.dog);
            ((BasicImageButtonsCard) card).setLeftButtonText("LEFT");
            ((BasicImageButtonsCard) card).setRightButtonText("RIGHT");

            if (i % 2 == 0)
                ((BasicImageButtonsCard) card).setDividerVisible(true);

            ((BasicImageButtonsCard) card).setOnLeftButtonPressedListener(new OnButtonPressListener() {
                @Override
                public void onButtonPressedListener(View view, Card card) {
                    Toast.makeText(getApplicationContext(), "Left button clicked", Toast.LENGTH_SHORT).show();
                    ((SimpleCard) card).setTitle("CHANGED ON RUNTIME");
                }
            });

            ((BasicImageButtonsCard) card).setOnRightButtonPressedListener(new OnButtonPressListener() {
                @Override
                public void onButtonPressedListener(View view, Card card) {
                    Toast.makeText(getApplicationContext(), "Right button clicked" + ((SimpleCard) card).getTitle(), Toast.LENGTH_SHORT).show();
                    listView.remove(card);
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
}
