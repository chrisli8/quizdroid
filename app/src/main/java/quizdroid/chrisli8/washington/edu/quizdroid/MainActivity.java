package quizdroid.chrisli8.washington.edu.quizdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity {

    public static final String topic = "Topic";
    public static final String questionNumber = "QuestionNumber";

    private String[] topics = new String[] {
            "Math", "Physics", "Marvel Super Heroes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long id) {

                Intent newActivity;

                switch (position) {
                    case 0:
                        newActivity = new Intent(v.getContext(), QuizActivity.class);
                        newActivity.putExtra(MainActivity.topic, "math");
                        newActivity.putExtra(MainActivity.questionNumber, 0);
                        startActivity(newActivity);
                        break;
                    case 1:
                        newActivity = new Intent(v.getContext(), PhysicsTopic.class);
                        startActivity(newActivity);
                        break;
                    case 2:
                        newActivity = new Intent(v.getContext(), MarvelHeroesTopic.class);
                        startActivity(newActivity);
                        break;
                }
            }
        });

    }
}
