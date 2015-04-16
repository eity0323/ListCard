package com.zms.listcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.zms.listcard.cards.SimpleCard;
import com.zms.listcard.cards.SmallImageCard;
import com.zms.listcard.controller.OnDismissCallback;
import com.zms.listcard.controller.RecyclerItemClickListener;
import com.zms.listcard.model.Card;
import com.zms.listcard.model.CardItemView;
import com.zms.listcard.view.MaterialListView;

/**
 * Created by AlexZhou on 2015/4/15.
 * 17:53
 */
public class ActivitySmallImageCard extends Activity {
    private MaterialListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo);
        listView = (MaterialListView) findViewById(R.id.material_listview);
        for (int i = 0; i < 10; i++) {
            SimpleCard card;
            String title = "Small Image Card title-" + i;
            String description = "Small Image Card description-" + i;

            card = new SmallImageCard(this);
            card.setDescription(description);
            card.setTitle(title);
            card.setDrawable(R.drawable.ic_launcher);
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

        listView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),
                new MyRecyclerItemClickListener()));

    }

    class MyRecyclerItemClickListener implements RecyclerItemClickListener.OnItemClickListener {
        @Override
        public void onItemClick(CardItemView view, int position) {
            Toast.makeText(getApplicationContext(), "CARD NUMBER " + position + " Clicked",
                    Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onItemLongClick(CardItemView view, int position) {
            Toast.makeText(getApplicationContext(), "CARD NUMBER " + position + " Long Clicked",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
