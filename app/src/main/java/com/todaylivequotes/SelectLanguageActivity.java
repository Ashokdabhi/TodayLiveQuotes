package com.todaylivequotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelectLanguageActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        mContext = SelectLanguageActivity.this;
        Button btn_english = findViewById(R.id.btn_english);
        Button btn_hindi = findViewById(R.id.btn_hindi);
        btn_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(mContext, HomeActivity.class);
                startActivity(homeIntent);
            }
        });
        btn_hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectLanguageActivity.this, "this functionality is currently under deployment", Toast.LENGTH_SHORT).show();
            }
        });
    }
}