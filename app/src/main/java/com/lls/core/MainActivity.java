package com.lls.core;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.williamhscott.repo1.R;

public class MainActivity extends Activity {
    private View.OnClickListener mClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickListener = new LLSClickListener(this);

        setButtonClickListener(mClickListener);
    }


    private class LLSClickListener extends View.OnClickListener {
        private Activity activity;

        public LLSClickListener(Activity main) {
            this.activity = main;
        }


    }


    private void setButtonClickListener() {
        Button blogButton = findViewById(R.id.blog_button);
        Button cameraButton = findViewById(R.id.camera_button);
        blogButton.setOnClickListener();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
