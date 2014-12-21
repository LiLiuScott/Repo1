package com.lls.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.lls.blog.BlogActivity;
import com.lls.camera.CameraActivity;
import com.lls.core.repo1.R;

public class MainActivity extends Activity {
    private View.OnClickListener mClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickListener = new LLSClickListener(this);

        setButtonClickListener(mClickListener);
    }


    private class LLSClickListener implements View.OnClickListener {
        private Activity activity;

        public LLSClickListener(Activity main) {
            this.activity = main;
        }

        @Override
        public void onClick(View button) {
            Intent startIntent;
            switch (button.getId()) {
                case R.id.blog_button:
                    startIntent = new Intent(activity, BlogActivity.class);
                    activity.startActivity(startIntent);
                    break;
                case R.id.camera_button:
                    startIntent = new Intent(activity, CameraActivity.class);
                    activity.startActivity(startIntent);
                    break;
            }
        }
    }

    private void setButtonClickListener(View.OnClickListener clickListener) {
        Button blogButton = (Button) findViewById(R.id.blog_button);
        Button cameraButton = (Button) findViewById(R.id.camera_button);
        blogButton.setOnClickListener(clickListener);
        cameraButton.setOnClickListener(clickListener);
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
