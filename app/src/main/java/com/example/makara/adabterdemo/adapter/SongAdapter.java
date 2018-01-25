package com.example.makara.adabterdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.makara.adabterdemo.entity.Song;

import java.util.List;

/**
 * Created by Chan Makara on 1/24/2018.
 */

public class SongAdapter extends BaseAdapter{

    private List<Song> list;
    private Context context

    public SongAdapter(Context context, List<Song> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
