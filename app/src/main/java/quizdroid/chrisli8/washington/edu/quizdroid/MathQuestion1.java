package quizdroid.chrisli8.washington.edu.quizdroid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MathQuestion1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question1);

        String name = "physics_question_1";

        TextView question = (TextView) findViewById(R.id.mathQuestion1);
        question.setText(getResources().getString(R.string.physics_question_1));
    }
}
