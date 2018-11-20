package sdmgap.arif.com.outfits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.os.SystemClock.sleep;

public class Splash_Screen extends AppCompatActivity
{
    private ImageView splashImageView;
    private TextView splashTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        splashImageView= findViewById(R.id.splashImageView);
        splashTextView= findViewById(R.id.splashTextView);

        //Animation for image
        Animation splashImageanimation= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.top_to_bottom);
        splashImageView.setAnimation(splashImageanimation);

        //Animation for Text
        Animation splashButtonanimation= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.bottom_to_top);
        splashTextView.setAnimation(splashButtonanimation);

        Animation buttonBlinkanimation= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.blink_animation);
        splashTextView.setAnimation(buttonBlinkanimation);

        AnimationSet splashButtonAnimset= new AnimationSet(false);
        splashButtonAnimset.addAnimation(splashButtonanimation);
        splashButtonAnimset.addAnimation(buttonBlinkanimation);

        splashTextView.startAnimation(splashButtonAnimset);



        final Intent splashintent= new Intent(Splash_Screen.this, MainActivity.class);

        Thread mythread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3500);
                } finally {
                    startActivity(splashintent);
                    finish();
                }
            }
        });

        mythread.start();
    }
}