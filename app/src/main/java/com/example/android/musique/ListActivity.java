package com.example.android.musique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Button shopButton = findViewById(R.id.shopButton);
        shopButton.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(ListActivity.this, ShopActivity.class);
                startActivity(intent);
            }
        });

        Button playerButton = findViewById(R.id.homeButton);
        playerButton.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
