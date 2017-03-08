package com.example.gustavemugabo.kinya;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private AudioManager mAudioManager;
    private MediaPlayer.OnCompletionListener mCompletionListern = new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();

        }


    };
    private ArrayList<Word> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        this.mAudioManager = (AudioManager) getSystemService(getApplicationContext().AUDIO_SERVICE);

        this.words = new ArrayList<Word>();
        words.add(new Word("Rimwe", "One", R.drawable.number_one, R.raw.nine));
        words.add(new Word("Kabiri", "Two", R.drawable.number_two, R.raw.nine));
        words.add(new Word("Gatatu", "Three", R.drawable.number_three, R.raw.nine));
        words.add(new Word("Kane", "Four", R.drawable.number_four));
        words.add(new Word("Gatanu", "Five", R.drawable.number_five));
        words.add(new Word("Gatandatu", "Six", R.drawable.number_six));
        words.add(new Word("Karindwi", "Seven", R.drawable.number_seven));
        words.add(new Word("Umunani", "Huit", R.drawable.number_eight));
        words.add(new Word("Icyenda", "Nine", R.drawable.number_nine, R.raw.nine));
        words.add(new Word("Icumi", "Ten", R.drawable.number_ten));


        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();

                int result = mAudioManager.requestAudioFocus(afChangeListener,
                        AudioManager.STREAM_MUSIC,
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mAudioManager.registerMdiaButtonEventReceiver(RemoteControlReceiver);


                }
                mMediaPlayer = MediaPlayer.create(getApplicationContext(), words.get(position).getAudiResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListern);

            }
        });
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        releaseMediaPlayer();

    }
}
