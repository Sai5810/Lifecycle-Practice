package com.vakasai.lifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor pEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mc(View view) {
        Intent intent = new Intent(this, MCPlayer.class);
        MainActivity.this.startActivity(intent);
    }

    public void tos(View view) {
        Intent intent = new Intent(this, TOSPlayer.class);
        MainActivity.this.startActivity(intent);
    }

    public void misc(View view) {
        Intent intent = new Intent(this, MiscPlayer.class);
        MainActivity.this.startActivity(intent);
    }
}