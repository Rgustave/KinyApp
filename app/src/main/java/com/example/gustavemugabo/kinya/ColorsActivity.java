package com.example.gustavemugabo.kinya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Umweru", "White", R.drawable.color_white));
        words.add(new Word("Icyatsi", "Green", R.drawable.color_green));
        words.add(new Word("Umutuku", "Red", R.drawable.color_red));
        words.add(new Word("Umuhondo", "Yellow", R.drawable.color_mustard_yellow));
        words.add(new Word("Umukara", "Black", R.drawable.color_black));
        words.add(new Word("Igitaka", "Brown", R.drawable.color_brown));
        words.add(new Word("Ikijuju", "Grey", R.drawable.color_gray));


        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.listColor);
        listView.setAdapter(wordAdapter);
    }
}
