package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FabricActivity extends AppCompatActivity {

    private int fabricID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric);

        //Set the fabricID value
        Intent intent = getIntent();
        fabricID = intent.getIntExtra("fabricID", -1);

        if(fabricID == -1){
            //Error
        } else if (fabricID == 0){
            //New fabric

        } else{
            getFabricInfo();
        }
    }

    @Override
    protected void onPause(){
        super.onPause();

        saveFabric();
    }

    private void getFabricInfo(){

    }

    private void saveFabric(){

    }
}
