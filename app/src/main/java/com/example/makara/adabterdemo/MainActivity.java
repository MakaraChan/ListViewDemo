package com.example.makara.adabterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ListView = findViewById(R.id.btn_Listview);

    }
    public void onClickListView(View view){
        Intent toy= new Intent(MainActivity.this,ListViewActivity.class);
        startActivity(toy);
    }
}
