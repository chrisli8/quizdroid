package quizdroid.chrisli8.washington.edu.quizdroid;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionFragment extends Fragment {

    public TextView question;

    public QuestionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frag = inflater.inflate(R.layout.fragment_question, container, false);

        String topic = savedInstanceState.get(MainActivity.topic).toString();
        int questionNumber = savedInstanceState.getInt(MainActivity.questionNumber);

        // set get corrent array of questions
        String[] questions;
        if(topic.equals("math")) {
            questions = getResources().getStringArray(R.array.math_questions);
        } else if (topic.equals("physics")) {
            questions = getResources().getStringArray(R.array.physics_questions);
        } else {
            questions = getResources().getStringArray(R.array.marvel_questions);
        }

        question = (TextView) frag.findViewById(R.id.question);
        question.setText(questions[questionNumber]);


        return frag;
    }

}
