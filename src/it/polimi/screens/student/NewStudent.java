package it.polimi.screens.student;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import it.polimi.R;
import it.polimi.models.Student;
import it.polimi.models.Teacher;

public class NewStudent extends Activity {

    private EditText studentName;
    private EditText matriculationNumber;
    private Button addStudent;
    private Spinner adviser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_student);

        studentName = (EditText) findViewById(R.id.student_name);
        matriculationNumber = (EditText) findViewById(R.id.matriculation_number);

        adviser = (Spinner) findViewById(R.id.adviser);
        ArrayAdapter adapter = new ArrayAdapter<Teacher>(this, R.layout.teacher_select_item, new Teacher().all());
        adviser.setAdapter(adapter);

        addStudent = (Button) findViewById(R.id.add);
        addStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Student student = new Student();
                student.name = studentName.getText().toString();
                student.matriculation_number = Long.decode(matriculationNumber.getText().toString());
                student.adviser = (Teacher) adviser.getSelectedItem();

                student.save();
                finish();
            }
        });
    }
}
