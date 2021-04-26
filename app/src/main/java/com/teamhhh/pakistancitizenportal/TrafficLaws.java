package com.teamhhh.pakistancitizenportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TrafficLaws extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_laws);
      /* webView=findViewById(R.id.webviewc);
       webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.nhmp.gov.pk/traffic_signs");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);*/
    }

    @Override
    public void onBackPressed() {
       /* if(webView.canGoBack()){
            webView.goBack();*/

        /*}else{}*/
            super.onBackPressed();
        }

    }
