package it.polimi.screens.course;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;

public class ViewCourse extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);

        long id = getIntent().getExtras().getLong("id");

        TextView name = (TextView) findViewById(R.id.name);

        TextView description = (TextView) findViewById(R.id.description);

        TextView teacher = (TextView) findViewById(R.id.teacher);

        TextView students = (TextView) findViewById(R.id.students);

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

}
