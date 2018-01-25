package com.example.makara.adabterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private String[] my_array;
    private ArrayAdapter<String> arrayAdapter;
    private ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        my_array=getResources().getStringArray(R.array.my_array);
        arrayAdapter =new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,my_array
        );
        mlistView= findViewById(R.id.listView);
        mlistView.setAdapter(arrayAdapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                goToDetail(my_array[position]);
                Toast.makeText(ListViewActivity.this,""+my_array[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    void goToDetail(String s){
        Intent i =new Intent(this,DetailActivity.class);
        i.putExtra("DATA", s);
        startActivity(i);
    }
}
