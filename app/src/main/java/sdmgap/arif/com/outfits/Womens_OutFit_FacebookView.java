package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Womens_OutFit_FacebookView extends AppCompatActivity
{
    private WebView womens_outfit_facebookWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens__out_fit__facebook_view);

        womens_outfit_facebookWebview= findViewById(R.id.womens_outfit_facebookWebview);

        //Enable java script
        WebSettings webSettings = womens_outfit_facebookWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        womens_outfit_facebookWebview.setWebViewClient(new WebViewClient());

        //Website enter
        womens_outfit_facebookWebview.loadUrl("https://www.facebook.com/Tfashion2/");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(womens_outfit_facebookWebview.canGoBack()){
            womens_outfit_facebookWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}