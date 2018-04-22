package com.example.avdey.diablo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class CarsActivity extends Activity {

    public static BrandCar brandCar =new BrandCar();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cars);


    }

    public void onClickToActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, GetIntent.class);
        intent.putExtra(GetIntent.MESSAGE, message);
        startActivity(intent);
    }

    public void onClickToIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent cng = Intent.createChooser(intent, "Метод отправки");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("text/plain");
        startActivity(cng);
    }

    public void onClickShowBrand(View view) {
        TextView textView = findViewById(R.id.show_car);
        Spinner country = findViewById(R.id.spinner);

        String type = String.valueOf(country.getSelectedItem());

        List<String> list = brandCar.getBrandCar(type);
        StringBuilder stringBuilder = new StringBuilder();

        for (String cars : list) {
            stringBuilder.append(cars).append("\n");
        }

        textView.setText(stringBuilder);
    }
}
