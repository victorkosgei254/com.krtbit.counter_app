package com.kritbit.counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText increments;
    TextView results;
    Button   play;
    Integer incs, res, disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increments = findViewById(R.id.editTextNumber);
        results = findViewById(R.id.counter_text);
        play = findViewById(R.id.play_btn);

        play.setOnClickListener(view -> {
            if (increments.getText().toString() == null)
            {
                incs = 0;
            }else {
                incs = Integer.parseInt(increments.getText().toString());
            }
            res = Integer.parseInt(results.getText().toString());
            if (incs > 100 || incs < -100)
            {
                Toast.makeText(MainActivity.this,"Increments should not be greater than 100 or less than -100", Toast.LENGTH_LONG).show();
            }
            else {
                disp = incs + res;
                results.setText(disp.toString());
            }

        });

    }

}