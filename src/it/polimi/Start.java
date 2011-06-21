package it.polimi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.androidrecord.db.DatabaseManager;
import it.polimi.models.Course;
import it.polimi.models.Student;
import it.polimi.screens.course.Courses;
import it.polimi.screens.student.Students;

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

        DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());
        databaseManager.registerModel(Student.class);
        databaseManager.registerModel(Course.class);
        databaseManager.bootStrapDatabase();
    }

}
