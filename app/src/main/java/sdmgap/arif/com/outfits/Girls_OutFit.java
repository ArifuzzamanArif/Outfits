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
import android.widget.ScrollView;
import android.widget.TextView;

public class Girls_OutFit extends AppCompatActivity
{

    private ScrollView girls_outfit_scrollView;

    private ImageButton girls_outfit_facebook,girls_outfit_youtube,girls_outfit_instagram;
    private TextView girls_phone_textVew,girls_back_to_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls__out_fit);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        girls_outfit_scrollView= findViewById(R.id.girls_outfit_scrollView);
        girls_outfit_facebook= findViewById(R.id.girls_outfit_facebook);
        girls_outfit_youtube= findViewById(R.id.girls_outfit_youtube);
        girls_outfit_instagram= findViewById(R.id.girls_outfit_instagram);
        girls_phone_textVew= findViewById(R.id.girls_phone_textVew);
        girls_back_to_home= findViewById(R.id.girls_back_to_home);



        Animation girlsOutfitanimation= AnimationUtils.loadAnimation(Girls_OutFit.this, R.anim.bottom_to_top);
        girls_outfit_scrollView.setAnimation(girlsOutfitanimation);



        girls_back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girlsBackHome= new Intent(Girls_OutFit.this, MainActivity.class);
                startActivity(girlsBackHome);
            }
        });


        girls_outfit_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girlsFacebook= new Intent(Girls_OutFit.this, Girls_OutFit_FacebookView.class);
                startActivity(girlsFacebook);
            }
        });


        girls_outfit_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girlsYoutube= new Intent(Girls_OutFit.this, Girls_OutFit_YouTubeView.class);
                startActivity(girlsYoutube);
            }
        });


        girls_outfit_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girlsInstagram= new Intent(Girls_OutFit.this, Girls_OutFit_InstagramView.class);
                startActivity(girlsInstagram);
            }
        });


        girls_phone_textVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girlsPhone = new Intent(Intent.ACTION_DIAL);
                girlsPhone.setData(Uri.parse("tel:01744349823"));
                startActivity(girlsPhone);
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