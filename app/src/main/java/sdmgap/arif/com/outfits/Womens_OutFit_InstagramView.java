package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Womens_OutFit_InstagramView extends AppCompatActivity
{
    private WebView womens_outfit_instagramWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens__out_fit__instagram_view);


        womens_outfit_instagramWebview= findViewById(R.id.womens_outfit_instagramWebview);

        //Enable java script
        WebSettings webSettings = womens_outfit_instagramWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        womens_outfit_instagramWebview.setWebViewClient(new WebViewClient());

        //Website enter
        womens_outfit_instagramWebview.loadUrl("https://www.instagram.com/women_with_style/?hl=en");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(womens_outfit_instagramWebview.canGoBack()){
            womens_outfit_instagramWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}