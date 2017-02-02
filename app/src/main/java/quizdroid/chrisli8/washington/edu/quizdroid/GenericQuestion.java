package quizdroid.chrisli8.washington.edu.quizdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class GenericQuestion extends Activity {
    public RadioButton choice1;
    public RadioButton choice2;
    public RadioButton choice3;
    public RadioButton choice4;
    public Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic_question);

        // get intent information
        Intent i = getIntent();
        String topic = i.getStringExtra(MainActivity.topic);
        int questionNumber = i.getIntExtra(MainActivity.questionNumber, 0);

        // set get corrent array of questions
        String[] questions;
        if(topic.equals("math")) {
            questions = getResources().getStringArray(R.array.math_questions);
        } else if (topic.equals("physics")) {
            questions = getResources().getStringArray(R.array.physics_questions);
        } else {
            questions = getResources().getStringArray(R.array.marvel_questions);
        }

        next = (Button) findViewById(R.id.btn_next);

        TextView question = (TextView) findViewById(R.id.mathQuestion1);
        question.setText(questions[questionNumber]);

        choice1 = (RadioButton) findViewById(R.id.choice1);
        choice2 = (RadioButton) findViewById(R.id.choice2);
        choice3 = (RadioButton) findViewById(R.id.choice3);
        choice4 = (RadioButton) findViewById(R.id.choice4);

        choice1.setOnClickListener(new MyListener());
        choice2.setOnClickListener(new MyListener());
        choice3.setOnClickListener(new MyListener());
        choice4.setOnClickListener(new MyListener());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next.setText("Clicked");
            }
        });


    }

    private class MyListener implements View.OnClickListener {

        public MyListener() {

        }

        @Override
        public void onClick(View view) {
            next.setVisibility(View.VISIBLE);
        }
    }
}
