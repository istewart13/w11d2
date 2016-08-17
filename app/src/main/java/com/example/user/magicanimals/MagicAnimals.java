package com.example.user.magicanimals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 16/08/2016.
 */
public class MagicAnimals extends AppCompatActivity {
    EditText mQuestionEditText;
    Button mCowButton;
    Button mPigButton;
    Button mSheepButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mCowButton = (Button)findViewById(R.id.cow_button);
        mPigButton = (Button)findViewById(R.id.pig_button);
        mSheepButton = (Button)findViewById(R.id.sheep_button);

        mCowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("EightBall:", "cow button clicked!");
                Log.d("EightBall:", "The question asked was '" + question + "'");
                String answer = "mooooooooooo";

                Intent intent = new Intent(MagicAnimals.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });

        mPigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("EightBall:", "pig button clicked!");
                Log.d("EightBall:", "The question asked was '" + question + "'");
                String answer = "ooiiinnnkkkkk";

                Intent intent = new Intent(MagicAnimals.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });

        mSheepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("EightBall:", "sheep button clicked!");
                Log.d("EightBall:", "The question asked was '" + question + "'");
                String answer = "baaaaaaaaaaa";

                Intent intent = new Intent(MagicAnimals.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });

    }
}