package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PatternsListActivity extends AppCompatActivity {
    private Pattern[] patterns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patterns_list);

        String[] suggestedFabrics = new String[]{"jersey", "cotton"};

        //Get patterns and add to array
        patterns = new Pattern[]{new Pattern("Test1", "Dress", "Me", "babeebeaneez.com", "Notes", "@drawable", suggestedFabrics, 1),
                new Pattern("Test2", "Shirt", "Me", "babeebeaneez.com", "Notes", "@drawable", suggestedFabrics, 2),
                new Pattern("Test3", "Skirt", "Me", "babeebeaneez.com", "Notes", "@drawable", suggestedFabrics, 3),
                new Pattern("Test4", "Dress", "Me", "babeebeaneez.com", "Notes", "@drawable", suggestedFabrics, 4)};

        //Set items for the gridview
        GridView gridview = (GridView) findViewById(R.id.gvPatterns);
        PatternAdapter adapter = new PatternAdapter(this, patterns);
        gridview.setAdapter(adapter);

        //Create on item click listener:
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), PatternActivity.class);
                intent.putExtra("action", "edit/view");
                intent.putExtra("patternID", patterns[i].getID());
                startActivity(intent);
            }
        });
    }

    public void onFabClick(View view) {
        Intent intent = new Intent(getApplicationContext(), PatternActivity.class);
        intent.putExtra("action", "new");
        startActivity(intent);
    }
}
