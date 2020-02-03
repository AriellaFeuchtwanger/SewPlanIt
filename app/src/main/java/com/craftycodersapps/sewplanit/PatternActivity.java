package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PatternActivity extends AppCompatActivity {

    private int patternID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern);

        //Set the patternID value
        Intent intent = getIntent();
        patternID = intent.getIntExtra("patternID", -1);

        if(patternID == -1){
            //Error
        } else if (patternID == 0){
            //New fabric

        } else{
            getPatternInfo();
        }
    }

    @Override
    protected void onPause(){
        super.onPause();

        savePattern();
    }

    private void getPatternInfo(){

    }

    private void savePattern(){

    }
}
