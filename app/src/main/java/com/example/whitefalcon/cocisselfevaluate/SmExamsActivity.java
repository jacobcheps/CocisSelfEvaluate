package com.example.whitefalcon.cocisselfevaluate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;

public class SmExamsActivity extends AppCompatActivity {
    PDFView smexampdf;
    private Toolbar smeToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sm_exams);

        smeToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(smeToolbar);
        getSupportActionBar().setTitle("Exam Papers");


        smexampdf = (PDFView) findViewById(R.id.pdfexams);
        smexampdf.fromAsset("pastpapers.pdf").load();
    }
}
