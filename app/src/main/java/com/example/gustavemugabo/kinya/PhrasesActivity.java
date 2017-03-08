package com.example.gustavemugabo.kinya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Komera", "Hello"));
        words.add(new Word("Urakoze", "Thank you!"));
        words.add(new Word("Urihe?", "Where are you"));
        words.add(new Word("Ndashonje", "I am hungry"));
        words.add(new Word("Ndi umukirisitu", "I am a christian"));
        words.add(new Word("Uvahe?", "Where are you from"));
        words.add(new Word("Ukunda iki?", "What do you like?"));
        words.add(new Word("Ndagukunda", "I love you"));
        words.add(new Word("Witwa nde?", "What is your name?"));
        words.add(new Word("Nitwa ...", "My name is ..."));


        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.listPhrases);
        listView.setAdapter(wordAdapter);
    }
}
