package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button b;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=null;
                int radioid = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioid);
                if (radioButton.getText().equals("C"))
                    i = new Intent(MainActivity.this, Activity2.class);
                else if (radioButton.getText().equals("C++"))
                    i = new Intent(MainActivity.this, Activity3.class);
                else if(radioButton.getText().equals("OS"))
                    i = new Intent(MainActivity.this, Activity5.class);
                else if (radioButton.getText().equals("Java"))
                    i = new Intent(MainActivity.this, Activity4.class);
                startActivity(i);
            }
        });
    }
}
