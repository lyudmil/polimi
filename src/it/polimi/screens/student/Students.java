package it.polimi.screens.student;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import it.polimi.GoTo;
import it.polimi.R;

public class Students extends Activity {

    private LinearLayout students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.students);

        Button addStudent = (Button) findViewById(R.id.add_student);
        addStudent.setOnClickListener(new GoTo(this, NewStudent.class));
        students = (LinearLayout) findViewById(R.id.students);
    }

    @Override
    protected void onResume() {
        super.onResume();

        students.removeAllViews();
    }
}
