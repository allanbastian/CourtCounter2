package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class NBAActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://www.espn.in/nba/scoreboard");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
