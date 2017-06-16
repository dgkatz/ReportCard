package com.strattondesign.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(89);
        grades.add(84);
        grades.add(92);
        ArrayList<String> classes = new ArrayList<String>();
        classes.add("Math");
        classes.add("History");
        classes.add("Science");

        ReportCard myReportCard = new ReportCard("Dan Katz",2017,grades,classes);
        Log.v("Report Card",myReportCard.toString());

        myReportCard.setStudentName("Daniel Katz");
        Log.v("Report Card",myReportCard.getStudentName().toString());

        myReportCard.addGradeAndClass(80,"Spanish");
        Log.v("Report Card",myReportCard.toString());
    }
}
