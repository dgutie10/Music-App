package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView main = (TextView) findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(ListActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchView = new Intent(ListActivity.this, SearchActivity.class);
                startActivity(searchView);
            }
        });

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        nowPlaying .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listView = new Intent(ListActivity.this, NowPlayingActivity.class);
                startActivity(listView);
            }
        });
    }
}
