package com.example.myanimationandela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button b;
   private Button w;
    private Button v;
    private Button f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button1);
        w=(Button)findViewById(R.id.second2) ;
        v=(Button)findViewById(R.id.second3);
        f=(Button)findViewById(R.id.second4) ;


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);

                b.startAnimation(animation);

            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fa=AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink_anim);
                w.startAnimation(fa);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fa=AnimationUtils.loadAnimation(MainActivity.this,R.anim.mixed_anim);
                v.startAnimation(fa);
            }
        });
    }
}
