package it.polimi.screens.course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import it.polimi.GoTo;
import it.polimi.R;
import it.polimi.models.Course;

public class CourseView {

    View view;
    private Context context;
    private Course course;

    public CourseView(Context context, Course course) {
        this.context = context;
        this.course = course;
        view = LayoutInflater.from(context).inflate(R.layout.course_item, null);
    }

    public View show() {
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(course.name);

        view.setOnClickListener(new GoTo(context, ViewCourse.class, course.id));
        return view;
    }
}
