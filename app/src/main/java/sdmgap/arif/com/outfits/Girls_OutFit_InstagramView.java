package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Girls_OutFit_InstagramView extends AppCompatActivity
{
    private WebView girls_outfit_instagramWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls__out_fit__instagram_view);

        girls_outfit_instagramWebview= findViewById(R.id.girls_outfit_instagramWebview);

        //Enable java script
        WebSettings webSettings = girls_outfit_instagramWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        girls_outfit_instagramWebview.setWebViewClient(new WebViewClient());

        //Website enter
        girls_outfit_instagramWebview.loadUrl("https://www.instagram.com/weareoutfitkids/?hl=en");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(girls_outfit_instagramWebview.canGoBack()){
            girls_outfit_instagramWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}