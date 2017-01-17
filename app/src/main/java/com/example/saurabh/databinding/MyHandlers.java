package com.example.saurabh.databinding;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by saurabh on 17/1/17.
 */

public class MyHandlers {
    private static final String TAG = "MyHandlers";

    public void onClickFriend(View view) {
        Log.d(TAG, "onClickFriend: Clicked");
    }

    public void onGoClick(View view, User user) {
        Toast.makeText(view.getContext(), user.toString(), Toast.LENGTH_SHORT).show();
    }
}
