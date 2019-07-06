package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void open(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/java/"));
        startActivity(i);
    }
    public void opent(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/java-tutorial"));
        startActivity(i);
    }
    public void openv(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=r59xYe3Vyks&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al"));
        startActivity(i);
    }

}
