package com.parth.parthdev.listdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.parth.parthdev.listdemo.MainActivity;
import com.parth.parthdev.listdemo.R;

/**
 * Created by Parth Patel on 22-Feb-18.
 */

public class CustomeAdapter extends BaseAdapter {
    static LayoutInflater inflater;
    private Context ctx;
    private int image[];
    private String name[];



    public CustomeAdapter(Context ctx, int image[], String name[]) {
        this.ctx = ctx;
        this.image = image;
        this.name = name;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        final ViewHolder holder;
        inflater = ((Activity) ctx).getLayoutInflater();

        if (convertview == null) {
            convertview = inflater.inflate(R.layout.list_item, null, true);
            holder = new ViewHolder();

            holder.image = (ImageView) convertview.findViewById(R.id.image);
            holder.name = (TextView) convertview.findViewById(R.id.name);

            convertview.setTag(holder);


        } else {
            holder = (ViewHolder) convertview.getTag();

        }

        holder.image.setImageResource(image[i]);
        holder.name.setText(name[i]);

        return convertview;
    }

    private class ViewHolder {
        ImageView image;
        TextView name;

    }
}
