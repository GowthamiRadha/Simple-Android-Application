package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void open(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/c-plus-plus/"));
        startActivity(i);
    }
    public void opent(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/cplusplus/"));
        startActivity(i);
    }
    public void openv(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SQHREey_Yuc&list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C"));
        startActivity(i);
    }
}
