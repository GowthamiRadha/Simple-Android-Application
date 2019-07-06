package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }
    public void open(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/operating-systems/"));
        startActivity(i);
    }
    public void opent(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/operating_system/"));
        startActivity(i);
    }
    public void openv(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bkSWJJZNgf8&list=PLxCzCOWd7aiGz9donHRrE9I3Mwn6XdP8p"));
        startActivity(i);
    }
}
