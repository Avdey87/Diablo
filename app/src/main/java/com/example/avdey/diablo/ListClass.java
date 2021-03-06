package com.example.avdey.diablo;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListClass extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayAdapter<DiabloClass> list = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, DiabloClass.diabloClass);
        ListView listView = getListView();
        listView.setAdapter(list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(ListClass.this, DescriptionClass.class);
        intent.putExtra(DescriptionClass.DESCRIPTION, (int) id);
        startActivity(intent);
    }
}
