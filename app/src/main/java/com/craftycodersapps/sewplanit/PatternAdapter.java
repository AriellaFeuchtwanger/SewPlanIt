package com.craftycodersapps.sewplanit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PatternAdapter extends BaseAdapter {
    private final Pattern[] patterns;
    private final Context context;

    public PatternAdapter(Context context, Pattern[] patterns) {
        this.patterns = patterns;
        this.context = context;
    }

    @Override
    public int getCount() {
        return patterns.length;
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
        final Pattern pattern = patterns[i];

        if(view == null){
            final LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.linearlayout_pattern, null);
        }

        final ImageView patternImage = view.findViewById(R.id.ivPatternImage);
        final TextView patternName = view.findViewById(R.id.tvPatternName);

        patternImage.setImageResource(R.drawable.a001stitches);
        patternName.setText(pattern.getName());

        return view;
    }
}
