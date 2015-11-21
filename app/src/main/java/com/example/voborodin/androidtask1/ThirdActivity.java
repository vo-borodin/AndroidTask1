package com.example.voborodin.androidtask1;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class ThirdActivity extends AppCompatActivity
{
	private ScaleTypeAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});


		Spinner spinner = (Spinner) findViewById(R.id.content_third_spinner);
		mAdapter = new ScaleTypeAdapter(this);
		spinner.setAdapter(mAdapter);
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
		{
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
			{
			    ImageView.ScaleType type = mAdapter.getItem(position);
				ImageView img = (ImageView) findViewById(R.id.content_third_image);
				img.setScaleType(type);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent)
			{

			}
		});
	}

}
