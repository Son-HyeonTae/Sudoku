package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table;
        table = (TableLayout)findViewById(R.id.tableLayout);

        BoardGenerator board = new BoardGenerator();

        TableRow tableRow0 = new TableRow(this);
        TableRow tableRow1 = new TableRow(this);
        TableRow tableRow2 = new TableRow(this);
        TableRow tableRow3 = new TableRow(this);
        TableRow tableRow4 = new TableRow(this);
        TableRow tableRow5 = new TableRow(this);
        TableRow tableRow6 = new TableRow(this);
        TableRow tableRow7 = new TableRow(this);
        TableRow tableRow8 = new TableRow(this);

        table.addView(tableRow0);
        table.addView(tableRow1);
        table.addView(tableRow2);
        table.addView(tableRow3);
        table.addView(tableRow4);
        table.addView(tableRow5);
        table.addView(tableRow6);
        table.addView(tableRow7);
        table.addView(tableRow8);

        TableRow.LayoutParams layoutParams =
                new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f
                );
        layoutParams.height=200;
        layoutParams.setMargins(5, 8, 1, 1);

        Button[][] buttons = new Button[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new Button(this);
                buttons[i][j].setLayoutParams(layoutParams);

                int number = 0;
                int randomNum = (int)(Math.random()*10);
                if (randomNum > 4) {
                    buttons[i][j].setText(Integer.toString(number = board.get(i, j)));
                }

                switch (i) {
                    case 0:
                        tableRow0.addView(buttons[i][j]);
                        break;
                    case 1:
                        tableRow1.addView(buttons[i][j]);
                        break;
                    case 2:
                        tableRow2.addView(buttons[i][j]);
                        break;
                    case 3:
                        tableRow3.addView(buttons[i][j]);
                        break;
                    case 4:
                        tableRow4.addView(buttons[i][j]);
                        break;
                    case 5:
                        tableRow5.addView(buttons[i][j]);
                        break;
                    case 6:
                        tableRow6.addView(buttons[i][j]);
                        break;
                    case 7:
                        tableRow7.addView(buttons[i][j]);
                        break;
                    case 8:
                        tableRow8.addView(buttons[i][j]);
                        break;
                }
            }
        }

        buttons[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "abcd", (int)1);
            }
        });
    }
}