package com.example.whitefalcon.cocisselfevaluate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class PastpapersActivity extends AppCompatActivity {
    Button smtests,smexams;
    private Toolbar ppToolbar;
    FlipperLayout bookflipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastpapers);

        bookflipper = (FlipperLayout) findViewById(R.id.sm_reference_books);
        
        setLayout();

        ppToolbar = (Toolbar) findViewById(R.id.pastpaper_page_toolbar);
        setSupportActionBar(ppToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Past Papers");

        //smtests = (Button) findViewById(R.id.testsbtn);
        smexams = (Button) findViewById(R.id.examsbtn);



        smexams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smexamsIntent = new Intent(PastpapersActivity.this,SmExamsActivity.class);
                startActivity(smexamsIntent);
            }
        });

    }

    private void setLayout() {
        int[] images = {
                R.drawable.sma,
                R.drawable.smb,
                R.drawable.smc,
                R.drawable.smd,
                R.drawable.sme

        };
        for (int i=0;i<5;i++){
            FlipperView view = new FlipperView(getBaseContext());

            view.setImageDrawable(images[i])
                    .setDescription("Image "+ (i+1));
            bookflipper.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                    Toast.makeText(PastpapersActivity.this, ""+(bookflipper.getCurrentPagePosition()+1), Toast.LENGTH_SHORT).show();
                }
            });
        }
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

        Intent mainIntent = new Intent(PastpapersActivity.this,MainActivity.class);
        startActivity(mainIntent);
    }
}
