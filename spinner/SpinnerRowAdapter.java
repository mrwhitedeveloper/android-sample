package com.mrwhitedeveloper.android.sample.spinner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.mrwhitedeveloper.android.sample.spinner.R;
import com.mrwhitedeveloper.android.sample.spinner.SpinnerRow;

public class SpinnerRowAdapter extends BaseAdapter {

    Context context;
    ArrayList<SpinnerRow> objects;

    public SpinnerRowAdapter(Context context, ArrayList<SpinnerRow> objects) {
        super();
        this.context = context;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        SpinnerRow cur_obj = objects.get(position);
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.row_course, parent, false);
        TextView label =  row.findViewById(R.id.title);//position==0
        label.setHintTextColor(Color.GRAY);
        if(cur_obj.getId().equals("0") || cur_obj.getId()=="0")
        {
           label.setText("");
           label.setHint(cur_obj.getTitle());
        }
        else{

        }
        label.setText(cur_obj.getTitle());

        return row;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        SpinnerRow currentObject = objects.get(position);
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.row_course, parent, false);
        TextView label =  row.findViewById(R.id.title);//position==0

        if(currentObject.getId().equals("0") || currentObject.getId()=="0")
        {
            row.setBackgroundColor(Color.GRAY);
            label.setHintTextColor(Color.WHITE);
            label.setText("");
            label.setHint(currentObject.getTitle());
        }
        else{
            label.setText(currentObject.getTitle());
        }


        return row;
    }
}
