package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Boys_OutFit_YouTubeView extends AppCompatActivity
{
    private WebView boys_outfit_youtubeWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys__out_fit__you_tube_view);

        boys_outfit_youtubeWebview= findViewById(R.id.boys_outfit_youtubeWebview);

        //Enable java script
        WebSettings webSettings = boys_outfit_youtubeWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        boys_outfit_youtubeWebview.setWebViewClient(new WebViewClient());

        //Website enter
        boys_outfit_youtubeWebview.loadUrl("https://www.youtube.com/watch?v=cVcnvklEV2o");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(boys_outfit_youtubeWebview.canGoBack()){
            boys_outfit_youtubeWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}