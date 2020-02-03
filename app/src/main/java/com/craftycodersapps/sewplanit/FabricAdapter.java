package com.craftycodersapps.sewplanit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FabricAdapter extends BaseAdapter {
    private final Fabric[] fabrics;
    private final Context context;

    public FabricAdapter(Context context, Fabric[] fabrics){
        this.fabrics = fabrics;
        this.context = context;
    }
    @Override
    public int getCount() {
        return fabrics.length;
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

        final Fabric fabric = fabrics[i];

        if(view == null){
            final LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.linearlayout_fabric, null);
        }

        final ImageView fabricImage = view.findViewById(R.id.ivFabricImage);
        final TextView fabricName = view.findViewById(R.id.tvFabricName);

        fabricImage.setImageResource(R.drawable.a003fabric);
        fabricName.setText(fabric.getName());

        return view;

    }
}
