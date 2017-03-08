package com.example.gustavemugabo.kinya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Papa", "Father", R.drawable.family_father));
        words.add(new Word("Umuhungu", "Son", R.drawable.family_son));
        words.add(new Word("Mukuru wanjye (Umuhungu)", "Big Brother", R.drawable.family_older_brother));
        words.add(new Word("Murumuna wanjye (Umuhungu)", "Young Brother", R.drawable.family_younger_brother));
        words.add(new Word("Mama", "mother", R.drawable.family_mother));
        words.add(new Word("Umukobwa", "Daughter", R.drawable.family_daughter));
        words.add(new Word("Mushiki (umukobwa)", "Sister", R.drawable.family_older_sister));
        words.add(new Word(" Murumuna wanjye (umukobwa)", "Sister", R.drawable.family_younger_sister));
        words.add(new Word("Sogokuru", "Grand Father", R.drawable.family_grandfather));
        words.add(new Word("Nyongokuru", "Grand Mother", R.drawable.family_grandmother));


        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.listFamily);
        listView.setAdapter(wordAdapter);
    }
}
