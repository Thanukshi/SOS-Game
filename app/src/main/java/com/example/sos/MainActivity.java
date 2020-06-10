package com.example.sos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[][]buttons = new Button[3][3];
    private boolean player1 = true;
    private int roundCount;
    private int player1Points;
    private int player2Points;

    private TextView Player1;
    private TextView Player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Player1 = findViewById(R.id.player1);
        Player2 = findViewById(R.id.player2);


    }
}
