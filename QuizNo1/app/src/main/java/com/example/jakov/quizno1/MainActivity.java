package com.example.android.quizno1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        EditText answerQ1 = (EditText) findViewById(R.id.answer_powerhouse);
        String answer = answerQ1.getText().toString();

        RadioButton radioButton1Q2 = (RadioButton) findViewById(R.id.radiobutton1Q2);
        boolean isRadioButton1Q2 = radioButton1Q2.isChecked();


        RadioButton radioButton2Q2 = (RadioButton) findViewById(R.id.radiobutton2Q2);
        boolean isRadioButton2Q2 = radioButton2Q2.isChecked();


        RadioButton radioButton3Q2 = (RadioButton) findViewById(R.id.radiobutton3Q2);
        boolean isRadioButton3Q2 = radioButton3Q2.isChecked();


        CheckBox checkBox1Q3 = (CheckBox) findViewById(R.id.checkbox1Q3);
        boolean isCheckBox1Q3 = checkBox1Q3.isChecked();


        CheckBox checkBox2Q3 = (CheckBox) findViewById(R.id.checkbox2Q3);
        boolean isCheckBox2Q3 = checkBox2Q3.isChecked();


        CheckBox checkBox3Q3 = (CheckBox) findViewById(R.id.checkbox3Q3);
        boolean isCheckBox3Q3 = checkBox3Q3.isChecked();



        RadioButton radioButton1Q4 = (RadioButton) findViewById(R.id.radiobutton1Q4);
        boolean isRadioButton1Q4 = radioButton1Q4.isChecked();


        RadioButton radioButton2Q4 = (RadioButton) findViewById(R.id.radiobutton2Q4);
        boolean isRadioButton2Q4 = radioButton2Q4.isChecked();

        RadioButton radioButton3Q4 = (RadioButton) findViewById(R.id.radiobutton3Q4);
        boolean isRadioButton3Q4 = radioButton3Q4.isChecked();

        RadioButton radioButton1Q5 = (RadioButton) findViewById(R.id.radiobutton1Q5) ;
        boolean isRadioButton1Q5 = radioButton1Q5. isChecked();


        RadioButton radioButton2Q5 = (RadioButton) findViewById(R.id.radiobutton2Q5) ;
        boolean isRadioButton2Q5 = radioButton2Q5. isChecked();


        RadioButton radioButton3Q5 = (RadioButton) findViewById(R.id.radiobutton3Q5) ;
        boolean isRadioButton3Q5 = radioButton3Q5. isChecked();





        int resultQ1 = calculateResultQ1(answer);


        int resultQ2 = calculateResultQ2(isRadioButton1Q2, isRadioButton2Q2, isRadioButton3Q2);


        int resultQ3 = calculateResultQ3(isCheckBox1Q3, isCheckBox2Q3, isCheckBox3Q3);


        int resultQ4 = calculateResultQ4(isRadioButton2Q4);

        int resultQ5 = calculateResultQ5(isRadioButton3Q5);


        int result = resultQ1 + resultQ2 + resultQ3 + resultQ4 + resultQ5;

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


    private int calculateResultQ2(boolean checkBox2) {
        int result = 0;
        if (checkBox2) {
            result = 1;
        }
        return result;
    }


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


    private int calculateResultQ4(boolean radioButton2) {
        int result = 0;
        if (radioButton2) {
            result = 1;
        }
        return result;
    }

    private int calculateResultQ5(boolean checkBox3) {
        int result = 0;
        if (checkBox3) {
            result = 1;
        }
        return result;
    }

}