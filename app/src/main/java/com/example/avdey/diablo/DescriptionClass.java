package com.example.avdey.diablo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionClass extends Activity {

    public static final String DESCRIPTION = "desID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_class);


        int desID = (Integer) getIntent().getExtras().get(DESCRIPTION);
        DiabloClass listClass = DiabloClass.diabloClass[desID];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(listClass.getId());
        photo.setContentDescription(listClass.getName());

        TextView name = findViewById(R.id.name);
        name.setText(listClass.getName());

        TextView description = findViewById(R.id.description);
        description.setText(listClass.getDescription());

    }
}
