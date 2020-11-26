package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindLayoutView();
        setOnButtonClickListener();
    }
    public void bindLayoutView(){
        datePicker=(DatePicker) findViewById(R.id.datePicker);
        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.textView);
    }

    public void setOnButtonClickListener(){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Change Date"+getCurrentdate());
            }

        });
    }
    public String getCurrentdate(){
        StringBuilder builder=new StringBuilder();
        builder.append((datePicker.getMonth()+1)+"/");
        builder.append(datePicker.getDayOfMonth()+"/");
        builder.append(datePicker.getYear()+"/");
        return builder.toString();
    }
}