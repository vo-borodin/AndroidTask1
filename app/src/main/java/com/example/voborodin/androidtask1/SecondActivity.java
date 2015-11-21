package com.example.voborodin.androidtask1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.activity_second_radio_group);
        for (ImageView.ScaleType type: ImageView.ScaleType.values())
        {
            RadioButton btn = new RadioButton(this);
            btn.setText(type.toString());
            btn.setTag(type);
            radioGroup.addView(btn);
        }
        RadioButton childAt = (RadioButton) radioGroup.getChildAt(0);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                ImageView.ScaleType type = (ImageView.ScaleType) group.findViewById(checkedId).getTag();
                ImageView img = (ImageView) findViewById(R.id.content_second_image);
                img.setScaleType(type);
            }
        });

        radioGroup.check(childAt.getId());

    }
}
