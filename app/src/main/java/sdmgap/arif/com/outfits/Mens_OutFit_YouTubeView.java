package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mens_OutFit_YouTubeView extends AppCompatActivity
{
    private WebView mens_outfit_youtubeWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens__out_fit__you_tube_view);

        mens_outfit_youtubeWebview= findViewById(R.id.mens_outfit_youtubeWebview);

        //Enable java script
        WebSettings webSettings = mens_outfit_youtubeWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        mens_outfit_youtubeWebview.setWebViewClient(new WebViewClient());

        //Website enter
        mens_outfit_youtubeWebview.loadUrl("https://www.youtube.com/watch?v=6_oVJP3dteM");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(mens_outfit_youtubeWebview.canGoBack()){
            mens_outfit_youtubeWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}