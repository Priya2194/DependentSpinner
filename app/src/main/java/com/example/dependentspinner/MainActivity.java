package com.example.dependentspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp_parent,sp_child;
    ArrayList<String> arrayList_parent;
    ArrayList<String> arrayList_Animal,arrayList_Bird,arrayList_Flower;
    ArrayAdapter<CharSequence> arrayAdapter_parent,arrayAdapter_child;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_parent=findViewById(R.id.sp_parent);
        sp_child=findViewById(R.id.sp_child);

        arrayList_parent=new ArrayList<>();
        arrayAdapter_parent=ArrayAdapter.createFromResource(this,R.array.Category,
                android.R.layout.simple_spinner_item);
        arrayAdapter_parent.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        sp_parent.setAdapter(arrayAdapter_parent);

        sp_parent.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        if (position==0)
        {
            arrayAdapter_child= ArrayAdapter.createFromResource(this,R.array.Animal,
                    android.R.layout.simple_spinner_item);
            arrayAdapter_child.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        }
        if (position==1)
        {
            arrayAdapter_child= ArrayAdapter.createFromResource(this,R.array.Birds,
                    android.R.layout.simple_spinner_item);
            arrayAdapter_child.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        }
        if (position==2)
        {
            arrayAdapter_child= ArrayAdapter.createFromResource(this,R.array.Flower,
                    android.R.layout.simple_spinner_item);
            arrayAdapter_child.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        }
        sp_child.setAdapter(arrayAdapter_child);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}