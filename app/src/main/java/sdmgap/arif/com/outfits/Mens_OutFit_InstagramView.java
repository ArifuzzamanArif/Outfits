package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mens_OutFit_InstagramView extends AppCompatActivity
{
    private WebView mens_outfit_instagramWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens__out_fit__instagram_view);


        mens_outfit_instagramWebview= findViewById(R.id.mens_outfit_instagramWebview);

        //Enable java script
        WebSettings webSettings = mens_outfit_instagramWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        mens_outfit_instagramWebview.setWebViewClient(new WebViewClient());

        //Website enter
        mens_outfit_instagramWebview.loadUrl("https://www.instagram.com/mensfashions/");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(mens_outfit_instagramWebview.canGoBack()){
            mens_outfit_instagramWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}