package com.example.noteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tvTitle,tvDate,tvDesc,tvPr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent i=getIntent();
        tvTitle=(TextView)findViewById(R.id.tt);
        tvDate=(TextView)findViewById(R.id.tvdt);

        tvDesc=(TextView)findViewById(R.id.tvdescription);

        tvPr=(TextView)findViewById(R.id.tvprio);

        tvTitle.setText(i.getStringExtra("title"));


        tvDate.setText(i.getStringExtra("date"));
        tvDesc.setText(i.getStringExtra("desc"));

        tvPr.setText(i.getStringExtra("pr"));

    }
}
