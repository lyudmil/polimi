package it.polimi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import it.polimi.models.Student;

public class StudentView {

    protected View view;
    private Context context;
    private Student student;

    public StudentView(Context context, Student student) {
        this.context = context;
        this.student = student;
        view = LayoutInflater.from(context).inflate(R.layout.student_item, null);
    }

    public View show() {
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(student.name);

        TextView matriculationNumber = (TextView) view.findViewById(R.id.matriculation_number);
        matriculationNumber.setText(student.matriculation_number.toString());

        view.setOnClickListener(new GoTo(context, ViewStudent.class, student.id));

        return view;
    }
}
