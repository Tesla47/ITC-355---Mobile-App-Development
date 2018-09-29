package com.example.test.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne extends AppCompatActivity {

    EditText StudentID;
    EditText CourseCode;
    EditText StudentMark;

    TextView sid;
    TextView cid;
    TextView tmark;
    TextView tgrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_one);

        StudentID = findViewById(R.id.editText2);
        CourseCode = findViewById(R.id.editText6);
        StudentMark = findViewById(R.id.editText5);

        sid = findViewById(R.id.textView22);
        cid = findViewById(R.id.textView24);
        tmark = findViewById(R.id.textView26);
        tgrade = findViewById(R.id.textView16);

        List<String> List = new ArrayList<>();

    }

    public void ShowGradeButton(View view) {

        String stID = StudentID.getText().toString();
        String crID = CourseCode.getText().toString();
        String stMark = StudentMark.getText().toString();
        double stGrade = Double.parseDouble(stMark);

        sid.setText(stID);
        cid.setText(crID);
        tmark.setText(stMark);
        if (stGrade >= 94 && stGrade <= 100){
            tgrade.setText("A+");
        }
        else if (stGrade >= 90 && stGrade < 94) {
            tgrade.setText("A-");
        } else if (stGrade >= 87 && stGrade < 90) {
            tgrade.setText("B+");
        } else if (stGrade >= 84 && stGrade < 87) {
            tgrade.setText("B");
        } else if (stGrade >= 77 && stGrade < 80) {
            tgrade.setText("B-");
        } else if (stGrade >= 74 && stGrade < 77) {
            tgrade.setText("C+");
        } else if (stGrade >= 70 && stGrade < 74) {
            tgrade.setText("C");
        } else if (stGrade >= 67 && stGrade < 70) {
            tgrade.setText("C-");
        } else if (stGrade >= 60 && stGrade < 67) {
            tgrade.setText("D");
        } else tgrade.setText("F");
    }
}
