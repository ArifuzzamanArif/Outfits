package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Boys_OutFit_InstagramView extends AppCompatActivity
{

    private WebView boys_outfit_instagramWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys__out_fit__instagram_view);

        boys_outfit_instagramWebview= findViewById(R.id.boys_outfit_instagramWebview);

        //Enable java script
        WebSettings webSettings = boys_outfit_instagramWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        boys_outfit_instagramWebview.setWebViewClient(new WebViewClient());

        //Website enter
        boys_outfit_instagramWebview.loadUrl("https://www.instagram.com/fashionkids/?hl=en");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(boys_outfit_instagramWebview.canGoBack()){
            boys_outfit_instagramWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}