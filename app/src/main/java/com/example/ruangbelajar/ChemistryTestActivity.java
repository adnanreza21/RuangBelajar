package com.example.ruangbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ChemistryTestActivity extends AppCompatActivity {
    public QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;

    public static Button finish;
    public static Button keluar;


    public String mAnswer;
    public int mScore = 0;
    public int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_test);
        click();
    }
    public void click ()
    {
        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ResultTestActivity");
                startActivity(intent);
            }
        });
        keluar = (Button) findViewById(R.id.quit);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ChemistryActivity");
                startActivity(intent);
            }
        });


        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);


        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(ChemistryTestActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                }else {
                        Toast.makeText(ChemistryTestActivity.this,"Salah", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                }

            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(ChemistryTestActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(ChemistryTestActivity.this,"Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(ChemistryTestActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(ChemistryTestActivity.this,"Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

    }
    private void updateQuestion(){
        mQuestionView.setText((mQuestionLibrary.getQuestions(mQuestionNumber)));
        mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    private void updateScore(int point) {
        mScoreView.setText(""+mScore);
    }

}





