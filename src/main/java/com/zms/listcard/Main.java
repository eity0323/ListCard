package com.zms.listcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by AlexZhou on 2015/4/15.
 * 17:16
 */
public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnSmallImageCard = (Button) findViewById(R.id.btnSmallImageCard);
        btnSmallImageCard.setOnClickListener(new MyOnClickListener());

        Button btnBigImageCard = (Button) findViewById(R.id.btnBigImageCard);
        btnBigImageCard.setOnClickListener(new MyOnClickListener());

        Button btnBasicImageButtonCard = (Button) findViewById(R.id.btnBasicImageButtonCard);
        btnBasicImageButtonCard.setOnClickListener(new MyOnClickListener());

        Button btnWelcomeCard = (Button) findViewById(R.id.btnWelcomeCard);
        btnWelcomeCard.setOnClickListener(new MyOnClickListener());

        Button btnBasicListCard = (Button) findViewById(R.id.btnBasicListCard);
        btnBasicListCard.setOnClickListener(new MyOnClickListener());

        Button btnBigImageButtonCard = (Button) findViewById(R.id.btnBigImageButtonCard);
        btnBigImageButtonCard.setOnClickListener(new MyOnClickListener());

    }

    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnSmallImageCard:
                    Intent intent1 = new Intent(Main.this, ActivitySmallImageCard.class);
                    startActivity(intent1);
                    break;
                case R.id.btnBigImageCard:
                    Intent intent2 = new Intent(Main.this, ActivityBigImageCard.class);
                    startActivity(intent2);
                    break;
                case R.id.btnBasicImageButtonCard:
                    Intent intent3 = new Intent(Main.this, ActivityBasicImageButtonCard.class);
                    startActivity(intent3);
                    break;
                case R.id.btnWelcomeCard:
                    Intent intent4 = new Intent(Main.this, ActivityWelcomeCard.class);
                    startActivity(intent4);
                    break;
                case R.id.btnBasicListCard:
                    Intent intent5 = new Intent(Main.this, ActivityBasicListCard.class);
                    startActivity(intent5);
                    break;
                case R.id.btnBigImageButtonCard:
                    Intent intent6 = new Intent(Main.this, ActivityBigImageButtonCard.class);
                    startActivity(intent6);
                    break;
            }
        }
    }
}
