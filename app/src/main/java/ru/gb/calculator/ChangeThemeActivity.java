package ru.gb.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChangeThemeActivity extends AppCompatActivity {

    private TextView changeThemes;
    private Button theme1;
    private Button theme2;

    public static final String STYLE = "STYLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_theme);

        theme1 = findViewById(R.id.theme_1);
        theme2 = findViewById(R.id.theme_2);

        theme1.setOnClickListener(v -> {
            Intent intent = new Intent(ChangeThemeActivity.this, MainActivity.class);
            intent.putExtra(STYLE, false);
            startActivity(intent);
        });

        theme2.setOnClickListener(v -> {
            Intent intent = new Intent(ChangeThemeActivity.this, MainActivity.class);
            intent.putExtra(STYLE, true);
            startActivity(intent);
        });
    }
}