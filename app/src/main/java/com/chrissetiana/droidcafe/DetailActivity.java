package com.chrissetiana.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView androidName = findViewById(R.id.text_android_name);
        TextView androidApi = findViewById(R.id.text_android_api);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String api = intent.getStringExtra("api");

        androidName.setText(name);
        androidApi.setText(api);
    }
}
