package com.craftycodersapps.sewplanit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ProjectsListActivity extends AppCompatActivity {
    private Project[] projects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects_list);

        //Get all projects
        projects = new Project[]{
                new Project(1, "Project 1", "1/1/2001", "image", 4, "In progress"),
                new Project(2, "Project 2", "1/1/2001", "image", 4, "In progress"),
                new Project(3, "Project 3", "1/1/2001", "image", 4, "In progress"),
                new Project(4, "Project 4", "1/1/2001", "image", 4, "In progress")
        };

        //Gridview setup
        GridView gridView = (GridView) findViewById(R.id.gvProjectsList);
        ProjectAdapter adapter = new ProjectAdapter(getApplicationContext(), projects);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ProjectActivity.class);
                intent.putExtra("action", "edit/view");
                intent.putExtra("projectID", projects[i].getID());
                startActivity(intent);
            }
        });
    }

    public void onFabClick(View view) {
        Intent intent = new Intent(getApplicationContext(), ProjectActivity.class);
        intent.putExtra("action", "new");
        startActivity(intent);
    }


}
