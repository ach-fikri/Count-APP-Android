package com.example.uji3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.countView);
    }

    public void showtoast(View view) {
        Toast.makeText(this, R.string.pesanToast, Toast.LENGTH_SHORT).show();
    }

    public void UpCount(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void Minus(View view) {

        if (mCount == 0) {
            Toast.makeText(this, R.string.pesanMin, Toast.LENGTH_SHORT).show();
            return;

        } else {
            mCount--;
            mShowCount.setText(Integer.toString(mCount));
//            Toast.makeText(this, R.string.pesanMin, Toast.LENGTH_SHORT).show();
        }
    }
        public void reset (View view){
            if (mShowCount != null) {
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));
                Toast.makeText(this, R.string.pesanReset, Toast.LENGTH_SHORT).show();
            }

        }

}