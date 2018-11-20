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

public class Womens_OutFit extends AppCompatActivity
{
    private ScrollView womens_outfit_scrollView;

    private ImageButton womens_outfit_facebook,womens_outfit_youtube,womens_outfit_instagram;
    private TextView womens_phone_textVew,womens_back_to_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens__out_fit);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        womens_outfit_scrollView= findViewById(R.id.womens_outfit_scrollView);
        womens_outfit_facebook= findViewById(R.id.womens_outfit_facebook);
        womens_outfit_youtube= findViewById(R.id.womens_outfit_youtube);
        womens_outfit_instagram= findViewById(R.id.womens_outfit_instagram);
        womens_phone_textVew= findViewById(R.id.womens_phone_textVew);
        womens_back_to_home= findViewById(R.id.womens_back_to_home);



        Animation womensOutfitanimation= AnimationUtils.loadAnimation(Womens_OutFit.this, R.anim.bottom_to_top);
        womens_outfit_scrollView.setAnimation(womensOutfitanimation);



        womens_back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent womensBackHome= new Intent(Womens_OutFit.this, MainActivity.class);
                startActivity(womensBackHome);
            }
        });


        womens_outfit_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensFacebook= new Intent(Womens_OutFit.this, Womens_OutFit_FacebookView.class);
                startActivity(mensFacebook);
            }
        });


        womens_outfit_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensYoutube= new Intent(Womens_OutFit.this, Womens_OutFit_YouTubeView.class);
                startActivity(mensYoutube);
            }
        });


        womens_outfit_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensInstagram= new Intent(Womens_OutFit.this, Womens_OutFit_InstagramView.class);
                startActivity(mensInstagram);
            }
        });


        womens_phone_textVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent womensPhone = new Intent(Intent.ACTION_DIAL);
                womensPhone.setData(Uri.parse("tel:01744349823"));
                startActivity(womensPhone);
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