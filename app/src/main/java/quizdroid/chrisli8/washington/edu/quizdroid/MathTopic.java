package quizdroid.chrisli8.washington.edu.quizdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MathTopic extends Activity {

    public Button begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_topic);

        begin = (Button) findViewById(R.id.btn_math_begin);

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), GenericQuestion.class);
                newActivity.putExtra(MainActivity.topic, "math");
                newActivity.putExtra(MainActivity.questionNumber, 0);
                startActivity(newActivity);
            }
        });
    }
}
