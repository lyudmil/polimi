package it.polimi.screens.student;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;

public class ViewStudent extends Activity {

    private TextView name;
    private TextView matriculationNumber;
    private TextView adviser;
    private TextView courses;
    private Button addCourse;
    protected long studentId;
    protected Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);

        studentId = getIntent().getExtras().getLong("id");

        name = (TextView) findViewById(R.id.name);
        matriculationNumber = (TextView) findViewById(R.id.matriculation_number);
        adviser = (TextView) findViewById(R.id.adviser);
        courses = (TextView) findViewById(R.id.courses);
        addCourse = (Button) findViewById(R.id.add_course);
        delete = (Button) findViewById(R.id.delete);
    }

    @Override
    protected void onResume() {
        super.onResume();

        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
