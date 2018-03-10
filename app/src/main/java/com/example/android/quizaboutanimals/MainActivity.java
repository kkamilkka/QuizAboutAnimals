package com.example.android.quizaboutanimals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1(View view) {
        RadioButton answer1 = (RadioButton) findViewById(R.id.dolphins_true);
        if (answer1.isChecked()) {
            correctAnswerCount = correctAnswerCount + 1;
        }

        CheckBox answer2_1 = (CheckBox) findViewById(R.id.koala_chb2_true);
        CheckBox answer2_2 = (CheckBox) findViewById(R.id.koala_chb3_true);
        if (answer2_1.isChecked() && answer2_2.isChecked()) {
            correctAnswerCount = correctAnswerCount + 1;
        }

        EditText answer3 = (EditText) findViewById(R.id.pandas_tr);
        String answerField = answer3.getText().toString();
        if (answerField.equals("Bamboo") || answerField.equals("bamboo") || answerField.equals("BAMBOO")) {
            correctAnswerCount = correctAnswerCount + 1;
        }

        RadioButton answer4 = (RadioButton) findViewById(R.id.giraffe_true);
        if (answer4.isChecked()) {
            correctAnswerCount = correctAnswerCount + 1;
        }
    }


    public void summary(View view) {
        Toast toast = Toast.makeText(this, "Great! " + correctAnswerCount + " points is yours! You are Awesome :)", Toast.LENGTH_SHORT);
        toast.show();
    }
}