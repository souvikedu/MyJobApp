package com.amaderorg.myjobapp.View;

import android.app.Activity;
import android.os.Bundle;

import com.amaderorg.myjobapp.R;

public class LaunchActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
