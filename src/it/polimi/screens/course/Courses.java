package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import it.polimi.GoTo;
import it.polimi.R;

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
    }
}
