package it.polimi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import it.polimi.models.Course;

public class Courses extends Activity {

    LinearLayout courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses);

        Button addCourse = (Button) findViewById(R.id.add_course);
        addCourse.setOnClickListener(new GoTo(this, NewCourse.class));

        courses = (LinearLayout) findViewById(R.id.courses);
    }

    @Override
    protected void onResume() {
        super.onResume();

        courses.removeAllViews();
        for (Course course : new Course().all()) {
            courses.addView(new CourseView(this, course).show());
        }
    }
}
