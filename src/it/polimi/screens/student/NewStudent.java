package it.polimi.screens.student;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import it.polimi.R;
import it.polimi.models.Student;

public class NewStudent extends Activity {

    private EditText studentName;
    private EditText matriculationNumber;
    private Button addStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_student);

        studentName = (EditText) findViewById(R.id.student_name);
        matriculationNumber = (EditText) findViewById(R.id.matriculation_number);

        addStudent = (Button) findViewById(R.id.add);
        addStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Student student = new Student();
                student.name = studentName.getText().toString();
                student.matriculation_number = Long.decode(matriculationNumber.getText().toString());

                student.save();
                finish();
            }
        });
    }
}
