package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    RelativeLayout layout = new RelativeLayout(this);
    TextView helloTextView = new TextView(this);
    helloTextView.setGravity(Gravity.CENTER);
    helloTextView.setTextSize(24);
    helloTextView.setText("hello world");
    layout.addView(helloTextView);
    setContentView(layout);
    Log.d(getClass().getName(), "hello world");
  }
}