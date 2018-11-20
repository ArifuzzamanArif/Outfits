package sdmgap.arif.com.outfits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Girls_OutFit_FacebookView extends AppCompatActivity
{

    private WebView girls_outfit_facebookWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls__out_fit__facebook_view);

        girls_outfit_facebookWebview= findViewById(R.id.boys_outfit_facebookWebview);

        //Enable java script
        WebSettings webSettings = girls_outfit_facebookWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set Application Browser
        girls_outfit_facebookWebview.setWebViewClient(new WebViewClient());

        //Website enter
        girls_outfit_facebookWebview.loadUrl("https://www.facebook.com/Little-Clothes-186782991357533/");
    }

    //Back Button


    @Override
    public void onBackPressed() {
        if(girls_outfit_facebookWebview.canGoBack()){
            girls_outfit_facebookWebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}