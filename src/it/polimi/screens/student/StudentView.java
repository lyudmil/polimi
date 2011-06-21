package it.polimi.screens.student;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import it.polimi.GoTo;
import it.polimi.R;
import it.polimi.models.Student;
import it.polimi.screens.ModelView;

public class StudentView extends ModelView<Student> {

    public StudentView(Context context, Student student) {
        super(context, student);
    }

    @Override
    public View show() {
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(model.name);

        TextView matriculationNumber = (TextView) view.findViewById(R.id.matriculation_number);
        matriculationNumber.setText(model.matriculation_number.toString());

        view.setOnClickListener(new GoTo(context, ViewStudent.class, model.id));

        return view;
    }

    @Override
    protected int getLayout() {
        return R.layout.student_item;
    }
}
