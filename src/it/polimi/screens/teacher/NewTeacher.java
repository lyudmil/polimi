package it.polimi.screens.teacher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;
import it.polimi.models.Teacher;

public class NewTeacher extends Activity {

    TextView name;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_teacher);

        name = (TextView) findViewById(R.id.teacher_name);
        title = (TextView) findViewById(R.id.teacher_title);

        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Teacher teacher = new Teacher();
                teacher.name = name.getText().toString();
                teacher.title = title.getText().toString();

                teacher.save();
                finish();
            }
        });
    }
}
