package sdmgap.arif.com.outfits;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Mens_OutFit extends AppCompatActivity
{
    private ScrollView mens_outfit_scrollView;
    private ImageView mens_businessOutfit_imageView1, mens_businessOutfit_imageView2,mens_businessOutfit_imageView3,
            mens_casualOutfit_imageView1,mens_casualOutfit_imageView2,mens_casualOutfit_imageView3,
            mens_modernOutfit_imageView1,mens_modernOutfit_imageView2,mens_modernOutfit_imageView3,mens_modernOutfit_imageView4,
            mens_modernOutfit_imageView5, mens_streetOutfit_imageView1,mens_streetOutfit_imageView2,mens_streetOutfit_imageView3;

    private ImageButton mens_outfit_facebook,mens_outfit_youtube,mens_outfit_instagram;
    private TextView mens_phone_textVew,mens_back_to_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens__out_fit);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mens_outfit_scrollView= findViewById(R.id.mens_outfit_scrollView);
        mens_outfit_facebook= findViewById(R.id.mens_outfit_facebook);
        mens_outfit_youtube= findViewById(R.id.mens_outfit_youtube);
        mens_outfit_instagram= findViewById(R.id.mens_outfit_instagram);
        mens_phone_textVew= findViewById(R.id.mens_phone_textVew);
        mens_back_to_home= findViewById(R.id.mens_back_to_home);



        Animation mensOutfitanimation= AnimationUtils.loadAnimation(Mens_OutFit.this, R.anim.bottom_to_top);
        mens_outfit_scrollView.setAnimation(mensOutfitanimation);



        mens_back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensBackHome= new Intent(Mens_OutFit.this, MainActivity.class);
                startActivity(mensBackHome);
            }
        });


        mens_outfit_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensFacebook= new Intent(Mens_OutFit.this, Mens_OutFit_FacebookView.class);
                startActivity(mensFacebook);
            }
        });


        mens_outfit_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensYoutube= new Intent(Mens_OutFit.this, Mens_OutFit_YouTubeView.class);
                startActivity(mensYoutube);
            }
        });


        mens_outfit_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensInstagram= new Intent(Mens_OutFit.this, Mens_OutFit_InstagramView.class);
                startActivity(mensInstagram);
            }
        });


        mens_phone_textVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mensPhone = new Intent(Intent.ACTION_DIAL);
                mensPhone.setData(Uri.parse("tel:01744349823"));
                startActivity(mensPhone);
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