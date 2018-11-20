package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Womens_OutFit_YouTubeView extends AppCompatActivity
{

    private WebView womens_outfit_youtubeWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens__out_fit__you_tube_view);


        womens_outfit_youtubeWebview= findViewById(R.id.womens_outfit_youtubeWebview);

        //Enable java script
        WebSettings webSettings = womens_outfit_youtubeWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        womens_outfit_youtubeWebview.setWebViewClient(new WebViewClient());

        //Website enter
        womens_outfit_youtubeWebview.loadUrl("https://www.youtube.com/watch?v=leSicM57gE4");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(womens_outfit_youtubeWebview.canGoBack()){
            womens_outfit_youtubeWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}