package it.polimi.screens.teacher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;
import it.polimi.models.Teacher;

public class ViewTeacher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher);

        long id = getIntent().getExtras().getLong("id");
        final Teacher teacher = new Teacher().find(id);

        TextView titleAndName = (TextView) findViewById(R.id.title_and_name);
        titleAndName.setText(teacher.title + " " + teacher.name);

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                teacher.destroy();
                finish();
            }
        });
    }
}
