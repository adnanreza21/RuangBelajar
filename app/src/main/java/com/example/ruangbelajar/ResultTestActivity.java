package com.example.ruangbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultTestActivity extends AppCompatActivity {
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

    }
}
