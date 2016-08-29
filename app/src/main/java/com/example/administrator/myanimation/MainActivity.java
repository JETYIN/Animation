package com.example.administrator.myanimation;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements View.OnClickListener {
    private RelativeLayout createRL;
    private RelativeLayout topicRL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        init();
    }

    private void init() {
        createRL = (RelativeLayout) findViewById(R.id.createactivity);
        topicRL = (RelativeLayout) findViewById(R.id.livingtopicactivity);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_create:
                showAnimation(topicRL);
                break;
            case R.id.bt_topic:
                hideAnimation(topicRL);
                break;
        }
    }

    private void showAnimation(View v) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.one);
        v.startAnimation(animation);
        v.setVisibility(View.VISIBLE);
    }

    private void hideAnimation(View v) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.two);
        v.startAnimation(animation);
        v.setVisibility(View.INVISIBLE);
    }
}
