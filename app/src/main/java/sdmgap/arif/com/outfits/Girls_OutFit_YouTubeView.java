package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Girls_OutFit_YouTubeView extends AppCompatActivity
{

    private WebView girls_outfit_youtubeWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls__out_fit__you_tube_view);

        girls_outfit_youtubeWebview= findViewById(R.id.girls_outfit_youtubeWebview);

        //Enable java script
        WebSettings webSettings = girls_outfit_youtubeWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        girls_outfit_youtubeWebview.setWebViewClient(new WebViewClient());

        //Website enter
        girls_outfit_youtubeWebview.loadUrl("https://www.youtube.com/watch?v=cVcnvklEV2o");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(girls_outfit_youtubeWebview.canGoBack()){
            girls_outfit_youtubeWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}