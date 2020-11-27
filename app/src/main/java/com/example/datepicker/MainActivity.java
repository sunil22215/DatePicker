package com.example.datepicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Button button;
    private TextView textView;
    private TimePicker timepicker;
    private Button button1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindLayoutView();
        setUpViewListener();
    }

    public void bindLayoutView() {
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        timepicker = (TimePicker) findViewById(R.id.timePicker);
        timepicker.setIs24HourView(true);
        button1 = (Button) findViewById(R.id.button1);
        textView1 = (TextView) findViewById(R.id.textView1);
    }

    public void setUpViewListener() {
        textView.setText("Current date:" + getCurrentdate());
        textView1.setText(getCurrentTime());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Change date:" + getCurrentdate());

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime() {
        String currentTime = "Current Time:" + timepicker.getCurrentHour() + ":" + timepicker.getCurrentMinute();
        return currentTime;
    }

    public String getCurrentdate() {
        StringBuilder builder = new StringBuilder();
        builder.append((datePicker.getMonth() + 1) + "/");
        builder.append(datePicker.getDayOfMonth() + "/");
        builder.append(datePicker.getYear() + ":  ");
        return builder.toString();
    }

}