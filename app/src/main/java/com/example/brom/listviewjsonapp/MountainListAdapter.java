package com.example.brom.listviewjsonapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MountainListAdapter extends ArrayAdapter<Mountain> {
    private Context mContext;

    @Override
    public void add(@Nullable Mountain object) {
        mountainList.add(object);
    }

    private List<Mountain> mountainList = new ArrayList<>();

    public MountainListAdapter(Context context, ArrayList<Mountain> list) {
        super(context, 0 , list);
        mContext = context;
        mountainList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Mountain currentMountain = mountainList.get(position);
        Log.d("a18filkr", "" + mountainList.get(position).getName());
        Log.d("a18filkr", "" + currentMountain.getName());

        TextView top = (TextView) listItem.findViewById(R.id.textView_top);
        top.setText(currentMountain.getName());

        TextView mid = (TextView) listItem.findViewById(R.id.textView_mid);
        mid.setText(currentMountain.getLocation());

        TextView bot = (TextView) listItem.findViewById(R.id.textView_bot);
        bot.setText("" +currentMountain.getHeight());

        return listItem;
    }
}

