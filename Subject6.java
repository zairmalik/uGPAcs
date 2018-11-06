package com.learn.uzair.ugpacs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Subject6 extends AppCompatActivity {

    private EditText grade1EditText, credit1EditText, grade2EditText, credit2EditText, grade3EditText, credit3EditText, grade4EditText, credit4EditText, grade5EditText, credit5EditText,
            grade6EditText, credit6EditText, lastSemesterTotalCreditEditText, lastSemesterCGPAEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject6);

        grade1EditText = findViewById(R.id.edittext_grade1);
        credit1EditText = findViewById(R.id.edittext_credit1);
        grade2EditText = findViewById(R.id.edittext_grade2);
        credit2EditText = findViewById(R.id.edittext_credit2);
        grade3EditText = findViewById(R.id.edittext_grade3);
        credit3EditText = findViewById(R.id.edittext_credit3);
        grade4EditText = findViewById(R.id.edittext_grade4);
        credit4EditText = findViewById(R.id.edittext_credit4);
        grade5EditText = findViewById(R.id.edittext_grade5);
        credit5EditText = findViewById(R.id.edittext_credit5);
        grade6EditText = findViewById(R.id.edittext_grade6);
        credit6EditText = findViewById(R.id.edittext_credit6);
        lastSemesterTotalCreditEditText = findViewById(R.id.edittext_last_semester_total_credit);
        lastSemesterCGPAEditText = findViewById(R.id.edittext_last_semester_cgpa);
    }

    public void calculate(View view){
        GradeToPointer gradeToPointer = new GradeToPointer();
        int totalCurrentCredit;
        double totalMaxPointer, totalMinPointer, maxGPA, minGPA;
        double totalLastSemesterPointer, totalOverallMaxPointer, totalOverallMinPointer, maxCPA, minCPA;

        String grade1String = grade1EditText.getText().toString();
        String credit1String = credit1EditText.getText().toString();
        String grade2String = grade2EditText.getText().toString();
        String credit2String = credit2EditText.getText().toString();
        String grade3String = grade3EditText.getText().toString();
        String credit3String = credit3EditText.getText().toString();
        String grade4String = grade4EditText.getText().toString();
        String credit4String = credit4EditText.getText().toString();
        String grade5String = grade5EditText.getText().toString();
        String credit5String = credit5EditText.getText().toString();
        String grade6String = grade6EditText.getText().toString();
        String credit6String = credit6EditText.getText().toString();

        String lastSemesterTotalCreditString = lastSemesterTotalCreditEditText.getText().toString();
        String lastSemesterCGPAString = lastSemesterCGPAEditText.getText().toString();

        if (TextUtils.isEmpty(credit1String)){
            credit1EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit2String)){
            credit2EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit3String)){
            credit3EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit4String)){
            credit4EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit5String)){
            credit5EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit6String)){
            credit5EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade1String)){
            grade1EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade2String)){
            grade2EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade3String)){
            grade3EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade4String)){
            grade4EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade5String)){
            grade5EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade6String)){
            grade5EditText.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(lastSemesterTotalCreditString)){
            lastSemesterTotalCreditEditText.setError("Last semester total credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(lastSemesterCGPAString)){
            lastSemesterCGPAEditText.setError("Last semester CGPA cannot be empty.");
            return;
        }

        if (gradeToPointer.isGradeLetter(grade1String)){
            Toast.makeText(this,"Grade for subject 1 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (gradeToPointer.isGradeLetter(grade2String)){
            Toast.makeText(this,"Grade for subject 2 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (gradeToPointer.isGradeLetter(grade3String)){
            Toast.makeText(this,"Grade for subject 3 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (gradeToPointer.isGradeLetter(grade4String)){
            Toast.makeText(this,"Grade for subject 4 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (gradeToPointer.isGradeLetter(grade5String)){
            Toast.makeText(this,"Grade for subject 5 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (gradeToPointer.isGradeLetter(grade6String)){
            Toast.makeText(this,"Grade for subject 6 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        int credit1Integer = Integer.parseInt(credit1String);
        int credit2Integer = Integer.parseInt(credit2String);
        int credit3Integer = Integer.parseInt(credit3String);
        int credit4Integer = Integer.parseInt(credit4String);
        int credit5Integer = Integer.parseInt(credit5String);
        int credit6Integer = Integer.parseInt(credit6String);
        int lastSemesterTotalCreditInteger = Integer.parseInt(lastSemesterTotalCreditString);

        double lastSemesterCGPADouble = Double.parseDouble(lastSemesterCGPAString);

        if (credit1Integer < 1 || credit1Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit2Integer < 1 || credit2Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit3Integer < 1 || credit3Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit4Integer < 1 || credit4Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit5Integer < 1 || credit5Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit6Integer < 1 || credit6Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (lastSemesterTotalCreditInteger > 130){
            Toast.makeText(this,"Invalid last semester total credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (lastSemesterCGPADouble > 4.0d){
            Toast.makeText(this,"Invalid last semester CGPA.",Toast.LENGTH_SHORT).show();
            return;
        }

        double grade1ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade1String.toUpperCase());
        double grade2ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade2String.toUpperCase());
        double grade3ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade3String.toUpperCase());
        double grade4ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade4String.toUpperCase());
        double grade5ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade5String.toUpperCase());
        double grade6ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade6String.toUpperCase());

        double grade1ToMinPointer = gradeToPointer.GradeToMinPointer(grade1String.toUpperCase());
        double grade2ToMinPointer = gradeToPointer.GradeToMinPointer(grade2String.toUpperCase());
        double grade3ToMinPointer = gradeToPointer.GradeToMinPointer(grade3String.toUpperCase());
        double grade4ToMinPointer = gradeToPointer.GradeToMinPointer(grade4String.toUpperCase());
        double grade5ToMinPointer = gradeToPointer.GradeToMinPointer(grade5String.toUpperCase());
        double grade6ToMinPointer = gradeToPointer.GradeToMinPointer(grade6String.toUpperCase());

        totalCurrentCredit = credit1Integer + credit2Integer + credit3Integer + credit4Integer + credit5Integer + credit6Integer;

        totalMaxPointer = (grade1ToMaxPointer*credit1Integer) + (grade2ToMaxPointer*credit2Integer) + (grade3ToMaxPointer*credit3Integer) + (grade4ToMaxPointer*credit4Integer)
                            + (grade5ToMaxPointer*credit5Integer) + (grade6ToMaxPointer*credit6Integer);
        totalMinPointer = (grade1ToMinPointer*credit1Integer) + (grade2ToMinPointer*credit2Integer) + (grade3ToMinPointer*credit3Integer) + (grade4ToMinPointer*credit4Integer)
                            + (grade5ToMinPointer*credit5Integer) + (grade6ToMinPointer*credit6Integer);

        maxGPA = totalMaxPointer/totalCurrentCredit;
        minGPA = totalMinPointer/totalCurrentCredit;

        totalLastSemesterPointer = lastSemesterCGPADouble*lastSemesterTotalCreditInteger;
        totalOverallMaxPointer = totalLastSemesterPointer + totalMaxPointer;
        totalOverallMinPointer = totalLastSemesterPointer + totalMinPointer;

        maxCPA = totalOverallMaxPointer/(lastSemesterTotalCreditInteger + totalCurrentCredit);
        minCPA = totalOverallMinPointer/(lastSemesterTotalCreditInteger + totalCurrentCredit);

        Intent toResult = new Intent(this,Result.class);
        toResult.putExtra("Max GPA",maxGPA);
        toResult.putExtra("Min GPA",minGPA);
        toResult.putExtra("Max CPA",maxCPA);
        toResult.putExtra("Min CPA",minCPA);

        startActivity(toResult);
    }
}
