package com.craftycodersapps.sewplanit;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectAdapter extends BaseAdapter {
    private final Project[] projects;
    private final Context context;

    public ProjectAdapter(Context context, Project[] projects){
        this.projects = projects;
        this.context = context;
    }
    @Override
    public int getCount() {
        return projects.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Project project = projects[i];

        if(view == null){
            final LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.linearlayout_project, null);
        }

        final ImageView projectImage = view.findViewById(R.id.ivProjectImage);
        final TextView projectName = view.findViewById(R.id.tvProjectName);

        if(project.getStatus().equals("In progress")){
            view.setBackgroundColor(Color.YELLOW);
        }

        projectImage.setImageResource(R.drawable.a006sweater);
        projectName.setText(project.getName());

        return view;
    }
}
