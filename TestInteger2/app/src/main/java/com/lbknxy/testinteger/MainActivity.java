package com.lbknxy.testinteger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Test_Integer";

    private Integer mId = 0;
    private Integer mAge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG," before : mId = " + mId);
        Log.d(TAG," before : mAge = " + mId);
        Log.d(TAG," ### call updateId(Integer id) ###");
        updateId(mId);
        Log.d(TAG," after : mId = " + mId);
        Log.d(TAG," after : mAge = " + mId);
    }

    public native void updateId(Integer id);

    static {
        System.loadLibrary("native-lib");
    }
}
