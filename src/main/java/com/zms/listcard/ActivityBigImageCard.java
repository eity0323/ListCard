package com.zms.listcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.zms.listcard.cards.BigImageCard;
import com.zms.listcard.cards.SimpleCard;
import com.zms.listcard.controller.OnDismissCallback;
import com.zms.listcard.model.Card;
import com.zms.listcard.view.MaterialListView;

/**
 * Created by AlexZhou on 2015/4/16.
 * 10:30
 */
public class ActivityBigImageCard extends Activity {
    private MaterialListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo);

        listView = (MaterialListView) findViewById(R.id.material_listview);
        for (int i = 0; i < 10; i++) {
            SimpleCard card;
            String title = "Big Image Card title-" + i;
            String description = "Big Image Card description-" + i;

            card = new BigImageCard(this);
            card.setDescription(description);
            card.setTitle(title);
            card.setDismissible(true);
            card.setDrawable(R.drawable.life);
            // card.setDrawable("http://cdnzz.ifanr.com/wp-content/uploads/2015/04/shutterstock_245867494.jpg");
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
