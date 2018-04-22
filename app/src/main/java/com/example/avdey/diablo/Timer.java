package com.example.avdey.diablo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Timer extends Activity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        if (savedInstanceState !=null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }

        runTimer();
    }

    private void runTimer() {
        final TextView timer = findViewById(R.id.timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hour = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int sec = seconds % 60;

                String time = String.format("%2d:%02d:%02d", hour, minutes, sec);
                timer.setText(time);

                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("seconds", seconds);
        outState.putBoolean("wasRunning", wasRunning);
        outState.putBoolean("running", running);
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            wasRunning = running;
            running = true;
        }
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }

    public void onClickCars(View view) {
        Intent intent = new Intent(Timer.this, CarsActivity.class);
        startActivity(intent);

    }
}
