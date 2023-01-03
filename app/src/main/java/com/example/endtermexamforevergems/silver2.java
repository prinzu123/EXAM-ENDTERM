package com.example.endtermexamforevergems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class silver2   extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.silverlayout);

        ImageView imgOne = findViewById(R.id.imageView4);
        ImageView imgTwo = findViewById(R.id.imageView5);
        ImageView imgThree = findViewById(R.id.imageView6);
        ImageView imgfour = findViewById(R.id.imageView7);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(silver2.this, r2.class);
                startActivity(intent);
            }
        });

        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(silver2.this, b2.class);
                startActivity(intent);
            }
        });

        imgThree.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(silver2.this, n2.class);
                startActivity(intent);
            }
        });

        imgfour.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(silver2.this, e2.class);
                startActivity(intent);
            }
        });
    }
}