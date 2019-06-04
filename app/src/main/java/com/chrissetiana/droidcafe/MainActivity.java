package com.chrissetiana.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }

    public void onImageClick(View view) {
        displayToast(getString(R.string.android_name));

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("name", getString(R.string.android_name));
        intent.putExtra("api", getString(R.string.android_api));
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
