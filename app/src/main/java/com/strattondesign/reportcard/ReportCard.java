package com.strattondesign.reportcard;

import java.util.ArrayList;

/**
 * Created by Daniel on 3/16/17.
 */

public class ReportCard {
    private String mStudentName;
    private int mReportYear;
    private ArrayList<Integer> mGrades = new ArrayList<Integer>();
    private ArrayList<String> mClasses = new ArrayList<String>();

    public ReportCard(String studentName,int reportYear,ArrayList<Integer> grades,ArrayList<String> classes){
        mStudentName = studentName;
        mReportYear = reportYear;
        mGrades = grades;
        mClasses = classes;
    }

    public void addGradeAndClass(Integer grade, String className){
        mGrades.add(grade);
        mClasses.add(className);
    }

    public void setReportYear(int reportYear){
        mReportYear = reportYear;
    }

    public void setStudentName(String studentName){
        mStudentName = studentName;
    }

    public Integer getGradeForClass(String classToGet){
        int index = mClasses.indexOf(classToGet);
        return mGrades.get(index);
    }

    @Override
    public String toString() {

        String rcString;

        rcString = "Report Card for: " + mStudentName + "  " +
                "School Year:" + mReportYear + "  ";

        for (int i = 0; i < mClasses.size(); i++){
            rcString += mGrades.get(i).toString() + " in " + mClasses.get(i) + "  ";
        }
        return rcString;
    }

    public String getStudentName(){
        return mStudentName;
    }

    public int getReportYear(){
        return mReportYear;
    }

    public ArrayList<Integer> getGrades(){
        return mGrades;
    }

    public ArrayList<String> getClasses(){
        return mClasses;
    }

}
