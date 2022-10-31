package com.example.tutor_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
/**
 * Created by Mr.Chan
 * Time 2022-10-31
 * Blog https://www.cnblogs.com/Frank-dev-blog/
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(MainActivity.this,SecondActivity.class));

        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.example.tutor_activity", "com.example.tutor_activity.SecondActivity"));
        startActivity(intent);

        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.example.tutor_activity","com.example.tutor_activity.SecondActivity");
        startActivity(intent);

        Intent intent = new Intent("Name");
        startActivity(intent);
    }
}