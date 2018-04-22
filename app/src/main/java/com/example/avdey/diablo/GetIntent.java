package com.example.avdey.diablo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GetIntent extends Activity {


    public static final String MESSAGE = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent);


        TextView textView = findViewById(R.id.message);
        String message = getIntent().getStringExtra(MESSAGE);
        textView.setText(message);

    }
}
