package com.example.mylisttest;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myList extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list);

        ArrayList uli = new ArrayList<String>();
        uli.add("one");
        uli.add("two");
        uli.add("three");
        uli.add("four");
        uli.add("five");

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, uli));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String text = (String)l.getItemAtPosition(position);

        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
