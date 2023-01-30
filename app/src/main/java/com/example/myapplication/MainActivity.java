package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
 ListView listview;
 TextView textView;
 EditText editText;
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> students=new ArrayList<String>();
        students.add("Ahmed");
        students.add("Farooq");
        students.add("Zubair");
        students.add("Aslam");
        listview=findViewById(R.id.myList);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,students);
        listview.setAdapter(arrayAdapter);
        editText=findViewById(R.id.editPersonName);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                students.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
        });


    }
}