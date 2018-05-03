package com.example.abrahamyann.reportcardultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an arrayList of reportCard class objects
        ArrayList<reportCard> reportCards = new ArrayList<reportCard>();
        reportCards.add(new reportCard("Yann","B",R.drawable.boy));
        reportCards.add(new reportCard("James","A",R.drawable.boy));
        reportCards.add(new reportCard("John","C",R.drawable.boy));
        reportCards.add(new reportCard("Elsa","A",R.drawable.boy));
        reportCards.add(new reportCard("Ezekiel","B",R.drawable.boy));
        reportCards.add(new reportCard("Yaya","A+",R.drawable.boy));
        reportCards.add(new reportCard("Cheik","A-",R.drawable.boy));
        reportCards.add(new reportCard("Calvin","D",R.drawable.boy));
        reportCards.add(new reportCard("Sammy","F",R.drawable.boy));

        // Create an {@link reportCardAdapter}, whose data source is a list of
        // {@link reportCard}s. The adapter knows how to create list item views for each item
        // in the list.
        reportCardAdapter cardAdapter = new reportCardAdapter(this,reportCards);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_class_report);
        listView.setAdapter(cardAdapter);
    }
}
