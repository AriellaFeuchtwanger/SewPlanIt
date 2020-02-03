package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class FabricsListActivity extends AppCompatActivity {

    private Fabric[] fabrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabrics_list);

        //Get all fabrics
        String[] materials = new String[]{"Cotton", "Spandex"};

        fabrics = new Fabric[]{
          new Fabric(1, "Fabric 1", "Jersey", "Testing", materials, "image"),
          new Fabric(2, "Fabric 2", "Jersey", "Testing", materials, "image"),
          new Fabric(3, "Fabric 3", "Jersey", "Testing", materials, "image"),
          new Fabric(4, "Fabric 4", "Jersey", "Testing", materials, "image")
        };

        //Set item on click for gridview
        GridView gridView = (GridView) findViewById(R.id.gvFabrics);
        FabricAdapter adapter = new FabricAdapter(getApplicationContext(), fabrics);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), FabricActivity.class);
                intent.putExtra("action", "edit/view");
                intent.putExtra("fabricID", fabrics[i].getID());
                startActivity(intent);
            }
        });
    }

    public void onFabClick(View view) {
        Intent intent = new Intent(getApplicationContext(), FabricActivity.class);
        intent.putExtra("fabricID", "0");
        startActivity(intent);
    }
}
