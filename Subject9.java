package com.learn.uzair.ugpacs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class Subject9 extends AppCompatActivity {

    private EditText grade1EditText, credit1EditText, grade2EditText, credit2EditText, grade3EditText, credit3EditText, grade4EditText, credit4EditText, grade5EditText, credit5EditText,
            grade6EditText, credit6EditText, grade7EditText, credit7EditText, grade8EditText, credit8EditText, grade9EditText, credit9EditText,
            lastSemesterTotalCreditEditText, lastSemesterCGPAEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject9);

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
        grade7EditText = findViewById(R.id.edittext_grade7);
        credit7EditText = findViewById(R.id.edittext_credit7);
        grade8EditText = findViewById(R.id.edittext_grade8);
        credit8EditText = findViewById(R.id.edittext_credit8);
        grade9EditText = findViewById(R.id.edittext_grade9);
        credit9EditText = findViewById(R.id.edittext_credit9);
        lastSemesterTotalCreditEditText = findViewById(R.id.edittext_last_semester_total_credit);
        lastSemesterCGPAEditText = findViewById(R.id.edittext_last_semester_cgpa);
    }

    public void calculate(View view){
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
        String grade7String = grade7EditText.getText().toString();
        String credit7String = credit7EditText.getText().toString();
        String grade8String = grade8EditText.getText().toString();
        String credit8String = credit8EditText.getText().toString();
        String grade9String = grade9EditText.getText().toString();
        String credit9String = credit9EditText.getText().toString();

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

        if (TextUtils.isEmpty(credit7String)){
            credit5EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit8String)){
            credit5EditText.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit9String)){
            credit5EditText.setError("Credit cannot be empty.");
            return;
        }
    }
}
