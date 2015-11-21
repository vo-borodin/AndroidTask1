package com.example.voborodin.androidtask1;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IT-ADMIN on 14.11.2015.
 */
public class ScaleTypeAdapter extends BaseAdapter
{
    static class ViewHolder
    {
        public TextView text;
    }

    private AppCompatActivity mActivity;

    public ScaleTypeAdapter(AppCompatActivity activity)
    {
        mActivity = activity;
    }

    @Override
    public int getCount()
    {
        return ImageView.ScaleType.values().length;
    }

    @Override
    public ImageView.ScaleType getItem(int position)
    {
        ImageView.ScaleType[] types = ImageView.ScaleType.values();
        return types[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if (rowView == null)
        {
            LayoutInflater layoutInflater = mActivity.getLayoutInflater();
            rowView = layoutInflater.inflate(R.layout.item_scale, null, false);

            viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.item_scale_text_view_caption);

            rowView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        viewHolder.text.setText(getItem(position).name());

        return rowView;
    }
}
