package com.example.whitefalcon.cocisselfevaluate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;

public class SmTestActivity extends AppCompatActivity {
    PDFView smtestpdf;
    private Toolbar smtToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sm_test);

        smtToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(smtToolbar);
        getSupportActionBar().setTitle("Test Papers");

        smtestpdf = (PDFView) findViewById(R.id.pdftest);
        smtestpdf.fromAsset("test.pdf").load();
    }
}
