package com.example.endtermexamforevergems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class gold1  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldlayout2);

        ImageView imgOne = findViewById(R.id.imageView4);
        ImageView imgTwo = findViewById(R.id.imageView5);
        ImageView imgThree = findViewById(R.id.imageView6);
        ImageView imgfour = findViewById(R.id.imageView7);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(gold1.this, r1.class);
                startActivity(intent);
            }
        });

        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(gold1.this, b1.class);
                startActivity(intent);
            }
        });

        imgThree.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(gold1.this, n1.class);
                startActivity(intent);
            }
        });

        imgfour.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(gold1.this, e1.class);
                startActivity(intent);
            }
        });
    }
}