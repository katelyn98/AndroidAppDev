package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
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

    //Called when the user taps count
    public void countUp(View view) {

        //increases the count on the screen
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    //Called when the user taps the reset button
    public void reset(View view){
        //reset the count variable to 0 when reset is tapped
        mShowCount.setText((Integer.toString(reset_value)));
        mCount = 0;

    }

    //Called when the user taps the avalanche button
    public void avalanche(View view) {
        Intent intent = new Intent(this, ScrollingPractice.class);
        startActivity(intent);
    }
}
