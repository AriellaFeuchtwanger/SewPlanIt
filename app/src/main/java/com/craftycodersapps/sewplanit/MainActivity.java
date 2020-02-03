package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check if user is logged in

        //TODO: User login/signup
        //TODO: Create database
    }

    public void onClick(View view){
        Intent intent;
        switch(view.getId()){
            case R.id.btnFabrics:
                intent = new Intent(getApplicationContext(), FabricsListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPatterns:
                intent = new Intent(getApplicationContext(), PatternsListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnProjects:
                intent = new Intent(getApplicationContext(), ProjectsListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSettings:
                intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
