package com.example.saurabh.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        List<User> users = new ArrayList<>();
        Map<Integer, User> usersmap = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            User user = new User("User " + i, null, "List " + i);
            users.add(user);
            user = new User("User " + i, null, "Map " + i);
            usersmap.put(i, user);
        }
        binding.setUsers(users);
        binding.setUsersmap(usersmap);
        MyHandlers handlers = new MyHandlers();
        binding.setHandler(handlers);
    }
}
