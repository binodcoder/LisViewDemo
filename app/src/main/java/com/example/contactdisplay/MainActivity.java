package com.example.contactdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray={"Binod Bhandari", "Bijay Gyawali", "Suman Tiwari", "Ram Thapa"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.name_list);

        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, nameArray);


        listView.setAdapter(arrayAdapter);
    }
}