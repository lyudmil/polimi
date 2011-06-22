package it.polimi.screens.enrollment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import it.polimi.R;
import it.polimi.models.Course;
import it.polimi.models.Enrollment;
import it.polimi.models.Student;

public class NewEnrollment extends Activity {

    protected Spinner courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_enrollment);

        long id = getIntent().getExtras().getLong("id");
        final Student student = new Student().find(id);

        courses = (Spinner) findViewById(R.id.courses);
        ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(this, R.layout.course_select_item, new Course().all());
        courses.setAdapter(adapter);

        Button enroll = (Button) findViewById(R.id.enroll);
        enroll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Enrollment enrollment = new Enrollment();
                enrollment.student = student;
                enrollment.course = (Course) courses.getSelectedItem();
                enrollment.save();

                finish();
            }
        });
    }
}
