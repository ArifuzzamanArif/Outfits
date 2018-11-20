package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Boys_OutFit_FacebookView extends AppCompatActivity
{
    private WebView boys_outfit_facebookWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys__out_fit__facebook_view);

        boys_outfit_facebookWebview= findViewById(R.id.boys_outfit_facebookWebview);

        //Enable java script
        WebSettings webSettings = boys_outfit_facebookWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        boys_outfit_facebookWebview.setWebViewClient(new WebViewClient());

        //Website enter
        boys_outfit_facebookWebview.loadUrl("https://www.facebook.com/fashionkidss/");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(boys_outfit_facebookWebview.canGoBack()){
            boys_outfit_facebookWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}