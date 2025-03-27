package com.game.samewithunity;

import android.os.Bundle;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
    }

    public int Add(int a,int b){
        return a+b;
    }
}