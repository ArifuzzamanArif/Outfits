package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mens_OutFit_FacebookView extends AppCompatActivity
{
    private WebView mens_outfit_facebookWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens__out_fit__facebook_view);


        mens_outfit_facebookWebview= findViewById(R.id.mens_outfit_facebookWebview);

        //Enable java script
        WebSettings webSettings = mens_outfit_facebookWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        mens_outfit_facebookWebview.setWebViewClient(new WebViewClient());

        //Website enter
        mens_outfit_facebookWebview.loadUrl("https://www.facebook.com/fashion.style.mens/");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(mens_outfit_facebookWebview.canGoBack()){
            mens_outfit_facebookWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}