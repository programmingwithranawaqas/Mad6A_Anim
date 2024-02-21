package com.example.mad6a_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;
    TextView tvHeading;

    Animation downward, heading_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivLogo = findViewById(R.id.ivLogo);
        tvHeading = findViewById(R.id.tvHeading);

        downward = AnimationUtils.loadAnimation(this, R.anim.downward);
        heading_anim = AnimationUtils.loadAnimation(this, R.anim.heading_anim);
        ivLogo.setAnimation(downward);
        tvHeading.setAnimation(heading_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }
}