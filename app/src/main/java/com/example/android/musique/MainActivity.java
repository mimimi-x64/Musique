package com.example.android.musique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView buttonList = findViewById(R.id.listButton);

        if (buttonList != null){
            buttonList.setOnClickListener(new OnClickListener( ) {

                @Override
                public void onClick(View view){
                    //Call ListActivity
                    Intent callList = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(callList);
                }
            });

        }
    }
}
