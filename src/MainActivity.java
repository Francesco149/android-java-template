package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
  private TextView helloTextView = null;
  private TextView getHelloTextView() {
    if (helloTextView == null) {
      TextView x = new TextView(this);
      x.setGravity(Gravity.CENTER);
      x.setTextSize(24);
      x.setText("hello world");
      helloTextView = x;
    }
    return helloTextView;
  }

  private LinearLayout layout = null;
  public LinearLayout getLayout() {
    if (layout == null) {
      LinearLayout x = new LinearLayout(this);
      x.setOrientation(LinearLayout.VERTICAL);
      x.addView(getHelloTextView());
      layout = x;
    }
    return layout;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayout());
    Log.d(getClass().getName(), "hello world");
  }
}
