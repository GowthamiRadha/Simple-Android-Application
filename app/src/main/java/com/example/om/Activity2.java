package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void open(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/c-programming-language/"));
        startActivity(i);
    }
    public void opent(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/cprogramming/"));
        startActivity(i);
    }
    public void openv(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=si-KFFOW2gw"));
        startActivity(i);
    }
}
