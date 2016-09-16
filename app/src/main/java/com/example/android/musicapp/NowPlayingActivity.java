package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView main = (TextView) findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchView = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(searchView);
            }
        });

        TextView list = (TextView) findViewById(R.id.list);

        list .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listView = new Intent(NowPlayingActivity.this, ListActivity.class);
                startActivity(listView);
            }
        });
    }
}
