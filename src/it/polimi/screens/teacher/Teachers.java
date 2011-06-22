package it.polimi.screens.teacher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import it.polimi.GoTo;
import it.polimi.R;

public class Teachers extends Activity {

    LinearLayout teachers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachers);

        teachers = (LinearLayout) findViewById(R.id.teachers);

        Button addTeacher = (Button) findViewById(R.id.add_teacher);
        addTeacher.setOnClickListener(new GoTo(this, NewTeacher.class));
    }

    @Override
    protected void onResume() {
        super.onResume();

        teachers.removeAllViews();
    }
}
