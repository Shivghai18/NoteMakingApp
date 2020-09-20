package com.example.noteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText edTitle,edDate,edDesc;
    Switch sw;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTitle=(EditText)findViewById(R.id.noteTitle);

        setTitle("Notes");
        edDate=(EditText)findViewById(R.id.inputDate);
        edDesc=(EditText)findViewById(R.id.inputDetail);
        btn=(Button)findViewById(R.id.submitButton);
        sw=(Switch)findViewById(R.id.switchbtn);
    }

    public void submitNote(View v)
    {
        String priority="Low";

        String noteTitle=edTitle.getText().toString();

        String noteDate=edDate.getText().toString();

        String noteDes=edDesc.getText().toString();

        Intent i=new Intent(this,DisplayActivity.class);
        if(sw.isChecked())
        {
            priority="High";
        }

        i.putExtra("title",noteTitle);
        i.putExtra("date",noteDate);
        i.putExtra("desc",noteDes);
        i.putExtra("pr",priority);

        startActivity(i);


    }
}
