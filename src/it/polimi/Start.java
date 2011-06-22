package it.polimi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import it.polimi.screens.course.Courses;
import it.polimi.screens.student.Students;
import it.polimi.screens.teacher.Teachers;

public class Start extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button students = (Button) findViewById(R.id.students);
        students.setOnClickListener(new GoTo(this, Students.class));

        Button courses = (Button) findViewById(R.id.courses);
        courses.setOnClickListener(new GoTo(this, Courses.class));

        Button teachers = (Button) findViewById(R.id.teachers);
        teachers.setOnClickListener(new GoTo(this, Teachers.class));
    }

}
