package com.example.voborodin.androidtask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);

		findViewById(R.id.activity_first_button_go_second_activity).setOnClickListener(this);
		findViewById(R.id.activity_first_button_go_to_third_activity).setOnClickListener(this);
	}

	public void goToSecondActivity()
	{
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}

	public void goToThirdActivity()
	{
		Intent intent = new Intent(this, ThirdActivity.class);
		startActivity(intent);
	}

	@Override
	public void onClick(View v)
	{
		if (v.getId() == R.id.activity_first_button_go_second_activity)
		{
			goToSecondActivity();
		}
		else if (v.getId() == R.id.activity_first_button_go_to_third_activity)
		{
			goToThirdActivity();
		}
	}
}
