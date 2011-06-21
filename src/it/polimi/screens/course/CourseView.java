package it.polimi.screens.course;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import it.polimi.GoTo;
import it.polimi.R;
import it.polimi.models.Course;
import it.polimi.screens.ModelView;

public class CourseView extends ModelView<Course> {

    public CourseView(Context context, Course model) {
        super(context, model);
    }

    public View show() {
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(model.name);

        view.setOnClickListener(new GoTo(context, ViewCourse.class, model.id));
        return view;
    }

    @Override
    protected int getLayout() {
        return R.layout.course_item;
    }
}
