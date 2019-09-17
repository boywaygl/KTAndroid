package com.example.student.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CustomArrayAdapter extends ArrayAdapter<HoaHau>{
    Context context;
    ArrayList<HoaHau> arrayList;
    int layoutResource;
    public CustomArrayAdapter(@NonNull Context context, int resource,ArrayList<HoaHau> objects) {
        super(context, resource,objects);
        this.context = context;
        this.arrayList = objects;
        this.layoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource,null);
        TextView tv1 = convertView.findViewById(R.id.textView);
        tv1.setText(arrayList.get(position).getName());
        TextView tv2 = convertView.findViewById(R.id.textView2);
        tv2.setText(arrayList.get(position).getNamSinhl());
        ImageView img = convertView.findViewById(R.id.img);
        img.setImageResource(arrayList.get(position).getImg());
        ImageView img2 = convertView.findViewById(R.id.img2);
        img2.setImageResource(arrayList.get(position).getImg2());
        return convertView;
    }
}
/*public class CustomArrayAdapter extends BaseAdapter{
    private List<HoaHau> list;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomArrayAdapter(List<HoaHau> list, LayoutInflater layoutInflater, Context context) {
        this.list = list;
        this.layoutInflater = layoutInflater;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }
    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.custom, null);
            holder = new ViewHolder();
            holder.avtView = (ImageView) view.findViewById(R.id.img1);
            holder.flagView = (ImageView) view.findViewById(R.id.img2);
            holder.nameView = (TextView) view.findViewById(R.id.textView);
            holder.namSinhView = (TextView) view.findViewById(R.id.textView2);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        HoaHau hoaHau = this.list.get(pos);
        holder.nameView.setText(hoaHau.getName());
        holder.namSinhView.setText(hoaHau.getNamSinhl());
        
    }
    static class ViewHolder {
        ImageView flagView;
        ImageView avtView;
        TextView nameView;
        TextView namSinhView;
    }
}*/