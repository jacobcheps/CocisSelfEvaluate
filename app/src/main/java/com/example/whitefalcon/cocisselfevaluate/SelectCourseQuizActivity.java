package com.example.whitefalcon.cocisselfevaluate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SelectCourseQuizActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button softwareBtn;
    public static final String EXTRA_COURSE_UNIT_ID = "extraCourseUnitID";
    private Button computerScienceBtn;
    private Button InformationTechBtn;
    private Button BlisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_quiz_course);
        mToolbar = (Toolbar) findViewById(R.id.first_quiz_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Quiz");

        softwareBtn = (Button) findViewById(R.id.software_engineering_button);
         softwareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent swIntent = new Intent(SelectCourseQuizActivity.this,SoftwareStartingQuizActivity.class);
                swIntent.putExtra(EXTRA_COURSE_UNIT_ID, softwareBtn.getId());
                startActivity(swIntent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       int id = item.getItemId();
       if (id == android.R.id.home){
           SendUserToMainActivity();
       }

        return true;
    }

    private void SendUserToMainActivity() {

        Intent mainIntent = new Intent(SelectCourseQuizActivity.this,MainActivity.class);
        startActivity(mainIntent);
    }
}
