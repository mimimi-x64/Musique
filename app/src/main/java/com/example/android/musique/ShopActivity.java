package com.example.android.musique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shop);
        Button buttonList = findViewById(R.id.listButton);
        if (buttonList != null){
            buttonList.setOnClickListener(new View.OnClickListener( ) {

                @Override
                public void onClick(View view){
                    //Call ListActivity
                    Intent callList = new Intent(ShopActivity.this, ListActivity.class);
                    startActivity(callList);
                }
            });
        }

        Button playerButton = findViewById(R.id.homeButton);
        playerButton.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(ShopActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
