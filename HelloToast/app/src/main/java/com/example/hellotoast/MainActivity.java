package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private int reset_value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showWaterfalls(View view) {
        Toast waterfalls = Toast.makeText(this, R.string.waterfall_message, Toast.LENGTH_SHORT);

        waterfalls.show();
    }

    public void countUp(View view) {

        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void reset(View view){
        mShowCount.setText((Integer.toString(reset_value)));
        mCount = 0;

    }
}
