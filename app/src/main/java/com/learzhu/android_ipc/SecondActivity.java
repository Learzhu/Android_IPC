package com.learzhu.android_ipc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.learzhu.manager.UserManager.sUserId;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("SecondActivity UserManager.sUserId  " + sUserId);
    }
}
