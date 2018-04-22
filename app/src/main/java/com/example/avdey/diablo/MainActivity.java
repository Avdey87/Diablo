package com.example.avdey.diablo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, ListClass.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = findViewById(R.id.option);
        listView.setOnItemClickListener(itemClickListener);
    }

    public void onClickTimer(View view) {
        Intent intent = new Intent(this, Timer.class);
        startActivity(intent);
    }
}
