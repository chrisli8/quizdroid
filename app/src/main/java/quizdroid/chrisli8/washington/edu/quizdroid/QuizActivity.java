package quizdroid.chrisli8.washington.edu.quizdroid;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

public class QuizActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

//        // collect intents data
//        Intent i = getIntent();
//        String topic = i.getStringExtra(MainActivity.topic);
//        int questionNumber = i.getIntExtra(MainActivity.questionNumber, 0);
        Bundle intents = getIntent().getExtras();

        QuestionFragment ff = new QuestionFragment();
        ff.setArguments(getIntent().getExtras());
        FragmentTransaction tx = getFragmentManager().beginTransaction();
        tx.replace(R.id.fragment_placeholder, ff);
        tx.commit();
    }
}
