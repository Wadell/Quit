package com.example.jakov.quizno1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by jakov on 18.3.2017..
 */

public class R {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit Answers button is clicked
     */
    public void submitAnswers(View view) {
        //Getting the answer to question 1
        EditText answerQ1 = (EditText) findViewById(R.id.answer_powerhouse);
        String answer = answerQ1.getText().toString();

        //Getting the answer to question 2 checkbox 1
        CheckBox checkBox1Q2 = (CheckBox) findViewById(R.id.checkbox1Q2);
        boolean isCheckBox1Q2 = checkBox1Q2.isChecked();

        //Getting the answer to question 2 checkbox 2
        CheckBox checkBox2Q2 = (CheckBox) findViewById(R.id.checkbox2Q2);
        boolean isCheckBox2Q2 = checkBox2Q2.isChecked();

        //Getting the answer to question 2 checkbox 3
        CheckBox checkBox3Q2 = (CheckBox) findViewById(R.id.checkbox3Q2);
        boolean isCheckBox3Q2 = checkBox3Q2.isChecked();

        //Getting the answer to question 3 checkbox 1
        CheckBox checkBox1Q3 = (CheckBox) findViewById(R.id.checkbox1Q3);
        boolean isCheckBox1Q3 = checkBox1Q3.isChecked();

        //Getting the answer to question 3 checkbox 2
        CheckBox checkBox2Q3 = (CheckBox) findViewById(R.id.checkbox2Q3);
        boolean isCheckBox2Q3 = checkBox2Q3.isChecked();

        //Getting the answer to question 3 checkbox 3
        CheckBox checkBox3Q3 = (CheckBox) findViewById(R.id.checkbox3Q3);
        boolean isCheckBox3Q3 = checkBox3Q3.isChecked();


        //Getting the answer to question 4 radio button 1
        RadioButton radioButton1Q4 = (RadioButton) findViewById(R.id.radiobutton1Q4);
        boolean isRadioButton1Q4 = radioButton1Q4.isChecked();

        //Getting the answer to question 4 radio button 1
        RadioButton radioButton2Q4 = (RadioButton) findViewById(R.id.radiobutton2Q4);
        boolean isRadioButton2Q4 = radioButton2Q4.isChecked();

        //Getting the answer to question 4 radio button 1
        RadioButton radioButton3Q4 = (RadioButton) findViewById(R.id.radiobutton3Q4);
        boolean isRadioButton3Q4 = radioButton3Q4.isChecked();


        //Calculate Question 1 result
        int resultQ1 = calculateResultQ1(answer);

        //Calculate Question 2 result
        int resultQ2 = calculateResultQ2(isCheckBox1Q2, isCheckBox2Q2, isCheckBox3Q2);

        //Calculate Question 3 result
        int resultQ3 = calculateResultQ3(isCheckBox1Q3, isCheckBox2Q3, isCheckBox3Q3);

        //Calculate Question 4 result
        int resultQ4 = calculateResultQ4(isRadioButton1Q4);

        //Calculate the quiz result
        int result = resultQ1 + resultQ2 + resultQ3 + resultQ4;

        //Display the quiz result in the Toast message
        Toast.makeText(this, "Good job! Your score is " + result + ". Thank you for participating!", Toast.LENGTH_LONG).show();

    }

    private int calculateResultQ1(String userAnswer) {
        int result = 0;
        String answer = "Mitochondria";
        if (userAnswer.equals(answer)) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which checkbox was selected in the question 2
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 2
     */
    private int calculateResultQ2(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox1) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which checkbox was selected in the question 3
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 3
     */
    private int calculateResultQ3(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox2 && checkBox3) {
            result = 1;
        }

        if (checkBox1) {
            result = 0;
        }
        return result;
    }

    /**
     * Check which radio button was selected in the question 4
     *
     * @param radioButton1 is whether or not the user checked the radio button 1
     * @return the score the user got for question 4
     */
    private int calculateResultQ4(boolean radioButton1) {
        int result = 0;
        if (radioButton1) {
            result = 1;
        }
        return result;
    }
}
