package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import it.polimi.R;
import it.polimi.models.Course;
import it.polimi.models.Teacher;

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
        ArrayAdapter<Teacher> adapter = new ArrayAdapter<Teacher>(this, R.layout.teacher_select_item, new Teacher().all());
        teacher.setAdapter(adapter);

        addCourse = (Button) findViewById(R.id.add);
        addCourse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Course course = new Course();
                course.name = courseName.getText().toString();
                course.description = courseDescription.getText().toString();
                course.teacher = (Teacher) teacher.getSelectedItem();

                course.save();
                finish();
            }
        });
    }
}
