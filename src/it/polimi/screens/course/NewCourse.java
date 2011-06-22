package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import it.polimi.R;

public class NewCourse extends Activity {

    private EditText courseName;
    private EditText courseDescription;
    private Button addCourse;
    private Spinner teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_course);

        courseName = (EditText) findViewById(R.id.course_name);
        courseDescription = (EditText) findViewById(R.id.course_description);

        teacher = (Spinner) findViewById(R.id.teacher);

        addCourse = (Button) findViewById(R.id.add);
        addCourse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
