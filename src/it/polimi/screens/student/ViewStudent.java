package it.polimi.screens.student;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.GoTo;
import it.polimi.R;
import it.polimi.models.Course;
import it.polimi.models.Enrollment;
import it.polimi.models.Student;
import it.polimi.screens.enrollment.NewEnrollment;

import java.util.ArrayList;

public class ViewStudent extends Activity {

    private TextView name;
    private TextView matriculationNumber;
    private TextView adviser;
    private TextView courses;
    private Button addCourse;
    private Student student;
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

        student = new Student().find(studentId);

        name.setText(student.name);
        matriculationNumber.setText(student.matriculation_number.toString());
        adviser.setText("Adviser: " + student.adviser.toString());
        courses.setText("Courses: " + student.getCoursesTaken());
        addCourse.setOnClickListener(new GoTo(this, NewEnrollment.class, student.id));

        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (Enrollment enrollment : student.enrollments) {
                    enrollment.destroy();
                }

                student.destroy();
                finish();
            }
        });
    }
}
