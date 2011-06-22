package it.polimi.screens.teacher;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import it.polimi.GoTo;
import it.polimi.R;
import it.polimi.models.Teacher;
import it.polimi.screens.ModelView;

public class TeacherView extends ModelView<Teacher> {

    public TeacherView(Context context, Teacher model) {
        super(context, model);
    }

    @Override
    public View show() {
        TextView titleAndName = (TextView) view.findViewById(R.id.title_and_name);
        view.setOnClickListener(new GoTo(context, ViewTeacher.class, model.id));
        return view;
    }

    @Override
    protected int getLayout() {
        return R.layout.teacher_item;
    }
}
