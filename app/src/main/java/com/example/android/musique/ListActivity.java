package com.example.android.musique;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {



    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //Create an MainActivity Object
        MainActivity mainAct = new MainActivity();

        //Call methods what catches the button and do intent from MainActivity
        mainAct.buttonIntent();
    }


}
