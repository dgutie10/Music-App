package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView main = (TextView) findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        TextView now_playing = (TextView) findViewById(R.id.now_playing);

        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchView = new Intent(SearchActivity.this, NowPlayingActivity.class);
                startActivity(searchView);
            }
        });

        TextView list = (TextView) findViewById(R.id.list);

        list .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listView = new Intent(SearchActivity.this, ListActivity.class);
                startActivity(listView);
            }
        });
    }
}
