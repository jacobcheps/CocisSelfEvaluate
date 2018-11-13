package com.example.whitefalcon.cocisselfevaluate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TimetablesActivity extends AppCompatActivity {

    private WebView timetablewebview;
    private Toolbar ttToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetables);

        ttToolbar = (Toolbar) findViewById(R.id.timetable_page_toolbar);
        setSupportActionBar(ttToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Time Tables");


        timetablewebview = (WebView) findViewById(R.id.cocis_timetables_webview);
        timetablewebview.setWebViewClient(new WebViewClient());
        timetablewebview.getSettings().setJavaScriptEnabled(true);
        timetablewebview.getSettings().setDomStorageEnabled(true);
        timetablewebview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        timetablewebview.loadUrl("http://cit4.mak.ac.ug/timetables");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            SendUserToMainActivity();
        }
        return true;
    }
    private void SendUserToMainActivity() {

        Intent mainIntent = new Intent(TimetablesActivity.this,MainActivity.class);
        startActivity(mainIntent);
    }
}
