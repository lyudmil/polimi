package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import it.polimi.R;
import it.polimi.models.Course;

public class NewCourse extends Activity {

    EditText courseName;
    EditText courseDescription;
    Button addCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_course);

        courseName = (EditText) findViewById(R.id.course_name);
        courseDescription = (EditText) findViewById(R.id.course_description);
        addCourse = (Button) findViewById(R.id.add);
        addCourse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Course course = new Course();
                course.name = courseName.getText().toString();
                course.description = courseDescription.getText().toString();

                course.save();
                finish();
            }
        });
    }
}
