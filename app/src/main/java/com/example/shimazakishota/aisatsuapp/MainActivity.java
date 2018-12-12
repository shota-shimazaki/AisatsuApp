package com.example.shimazakishota.aisatsuapp;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.button1) {
                showTimePickerDialog();
            }
            }

        private void showTimePickerDialog() {
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                            if (2 <= hourOfDay && hourOfDay <= 9 ) {
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.setText("おはよう");

                            }
                            else if (10 <= hourOfDay && hourOfDay <= 17){
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.setText("こんにちは");

                            }
                            else {
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.setText("こんばんは");

                            }  }
                    },
                    13, // 初期値（時間）
                    0,  // 初期値（分）
                    true);
            timePickerDialog.show();

                }
            }

