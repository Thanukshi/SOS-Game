package com.example.sos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button[][]buttons = new Button[3][3];
    private boolean player1 = true;
    private int roundCount;
    private int player1Points;
    private int player2Points;

    private TextView Player1;
    private TextView Player2;
    private  Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Player1 = findViewById(R.id.player1);
        Player2 = findViewById(R.id.player2);


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                String buttonID = "Button_" + i + j;
                int resId = getResources().getIdentifier(buttonID,"id",getPackageName());
                buttons[i][j] = findViewById(resId);
                buttons[i][j].setOnClickListener((View.OnClickListener) this);
            }
        }

        Reset = findViewById(R.id.button_reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
