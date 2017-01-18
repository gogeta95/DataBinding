package com.example.saurabh.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Saurabh", "Singhal", "go");
        binding.setUser(user);
        MyHandlers handlers = new MyHandlers();
        binding.setHandler(handlers);
    }
}
