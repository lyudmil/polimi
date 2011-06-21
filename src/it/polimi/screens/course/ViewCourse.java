package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;
import it.polimi.models.Course;

public class ViewCourse extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);

        long id = getIntent().getExtras().getLong("id");
        final Course course = new Course().find(id);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(course.name);

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(course.description);

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                course.destroy();
                finish();
            }
        });
    }
}
