package com.example.datastructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    CardView mCardView1;
    CardView mCardView2;
    CardView mCardView3;
    CardView mCardView4;
    CardView mCardView5;
    CardView mCardView6;
    Button mButton1;
    Button mButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);


        welcomepagedisplay();

        aboutpag();
        creditpage();

    }

    private void creditpage() {
            mButton2 = findViewById(R.id.button_view2);
            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(WelcomePage.this, CreditPage.class));
                }
            });
    }

    private void aboutpag() {
            mButton1 = findViewById(R.id.button_view1);
            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(WelcomePage.this, AboutPage.class));
                }
            });
    }

    private void welcomepagedisplay() {

        mCardView1 = findViewById(R.id.card_view1);
        mCardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomePage.this, ListActivity.class) );
            }
        });

    }


}
