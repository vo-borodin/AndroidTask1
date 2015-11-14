package com.example.voborodin.androidtask1;

import android.support.v7.app.AppCompatActivity;
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
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View root = mActivity.getLayoutInflater().inflate(R.layout.item_scale, null, false);

		TextView caption = (TextView)root.findViewById(R.id.item_scale_text_view_caption);
		caption.setText(getItem(position).name());
		root.setTag(getItem(position));
		return root;
	}
}
