package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ProjectActivity extends AppCompatActivity {

    private int projectID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        //Populate dropdowns
        String[] patterns = {"Select a Pattern", "Ashton Top", "Blackwood Cardigan"};
        String[] fabrics = {"Select a Fabric", "Jersey", "Cotton"};

        Spinner spFabric = (Spinner) findViewById(R.id.spFabrics);
        Spinner spPatterns = (Spinner)findViewById(R.id.spPatterns);

        ArrayAdapter<String> fabricAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fabrics);
        ArrayAdapter<String> patternAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, patterns);

        fabricAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        patternAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spFabric.setAdapter(fabricAdapter);
        spPatterns.setAdapter(patternAdapter);

        //Set the patternID value
        Intent intent = getIntent();
        projectID = intent.getIntExtra("projectID", -1);

        if(projectID == -1){
            //Error
        } else if (projectID == 0){
            //New fabric

        } else{
            getProjectInfo();
        }
    }

    @Override
    protected void onPause(){
        super.onPause();

        saveProject();
    }

    private void getProjectInfo(){

    }

    private void saveProject(){

    }
}
