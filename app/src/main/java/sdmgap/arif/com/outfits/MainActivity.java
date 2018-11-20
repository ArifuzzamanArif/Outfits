package sdmgap.arif.com.outfits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private CardView mensOutfitCardView, womensOutfitCardView,
            boysOutfitCardView, girlsOutfitCardView;

    private ImageView girls_logo,boys_logo,mens_logo,womens_logo;
    private TextView girls_text,boys_text,mens_text,womens_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mensOutfitCardView=findViewById(R.id.mensOutfitCardView);
        womensOutfitCardView=findViewById(R.id.womensOutfitCardView);
        boysOutfitCardView=findViewById(R.id.boysOutfitCardView);
        girlsOutfitCardView=findViewById(R.id.girlsOutfitCardView);

        girls_logo=findViewById(R.id.girls_logo);
        boys_logo=findViewById(R.id.boys_logo);
        mens_logo=findViewById(R.id.mens_logo);
        womens_logo=findViewById(R.id.womens_logo);

        girls_text=findViewById(R.id.girls_text);
        boys_text=findViewById(R.id.boys_text);
        mens_text=findViewById(R.id.mens_text);
        womens_text=findViewById(R.id.womens_text);



        Animation logoanimation1= AnimationUtils.loadAnimation(MainActivity.this, R.anim.top_to_bottom);
        mens_logo.setAnimation(logoanimation1);
        womens_logo.setAnimation(logoanimation1);


        Animation logoanimation2= AnimationUtils.loadAnimation(MainActivity.this, R.anim.bottom_to_top);
        boys_logo.setAnimation(logoanimation2);
        girls_logo.setAnimation(logoanimation2);


        Animation textanimation1= AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_to_right);
        Animation textanimation2= AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left);
        mens_text.setAnimation(textanimation1);
        womens_text.setAnimation(textanimation2);
        boys_text.setAnimation(textanimation1);
        girls_text.setAnimation(textanimation2);



        mensOutfitCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mensCardViewIntent= new Intent(MainActivity.this, Mens_OutFit.class);
                startActivity(mensCardViewIntent);

            }
        });

        womensOutfitCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mensCardViewIntent= new Intent(MainActivity.this, Womens_OutFit.class);
                startActivity(mensCardViewIntent);

            }
        });


        boysOutfitCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mensCardViewIntent= new Intent(MainActivity.this, Boys_Outfit.class);
                startActivity(mensCardViewIntent);

            }
        });


        girlsOutfitCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mensCardViewIntent= new Intent(MainActivity.this, Girls_OutFit.class);
                startActivity(mensCardViewIntent);

            }
        });

    }
}