package sdmgap.arif.com.outfits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Boys_Outfit extends AppCompatActivity
{

    private ScrollView boys_outfit_scrollView;

    private ImageButton boys_outfit_facebook,boys_outfit_youtube,boys_outfit_instagram;
    private TextView boys_phone_textVew,boys_back_to_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys__outfit);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        boys_outfit_scrollView= findViewById(R.id.boys_outfit_scrollView);
        boys_outfit_facebook= findViewById(R.id.boys_outfit_facebook);
        boys_outfit_youtube= findViewById(R.id.boys_outfit_youtube);
        boys_outfit_instagram= findViewById(R.id.boys_outfit_instagram);
        boys_phone_textVew= findViewById(R.id.boys_phone_textVew);
        boys_back_to_home= findViewById(R.id.boys_back_to_home);



        Animation boysOutfitanimation= AnimationUtils.loadAnimation(Boys_Outfit.this, R.anim.bottom_to_top);
        boys_outfit_scrollView.setAnimation(boysOutfitanimation);



        boys_back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boysBackHome= new Intent(Boys_Outfit.this, MainActivity.class);
                startActivity(boysBackHome);
            }
        });


        boys_outfit_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boysFacebook= new Intent(Boys_Outfit.this, Boys_OutFit_FacebookView.class);
                startActivity(boysFacebook);
            }
        });


        boys_outfit_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boysYoutube= new Intent(Boys_Outfit.this, Boys_OutFit_YouTubeView.class);
                startActivity(boysYoutube);
            }
        });


        boys_outfit_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boysInstagram= new Intent(Boys_Outfit.this, Boys_OutFit_InstagramView.class);
                startActivity(boysInstagram);
            }
        });


        boys_phone_textVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boysPhone = new Intent(Intent.ACTION_DIAL);
                boysPhone.setData(Uri.parse("tel:01744349823"));
                startActivity(boysPhone);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}