package com.example.gustavemugabo.kinya;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gustavemugabo on 1/19/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        super(context, 0, words);
        this.colorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView kinyaTextView = (TextView) listItemView.findViewById(R.id.number_kinyaTV);
        kinyaTextView.setText(currentWord.getKinyaVersion());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.number_engtv);
        englishTextView.setText(currentWord.getEnglishVersion());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageNumber);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getDrwableImageVersion());
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
