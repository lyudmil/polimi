package it.polimi.screens.teacher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.R;

public class ViewTeacher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher);

        long id = getIntent().getExtras().getLong("id");

        TextView titleAndName = (TextView) findViewById(R.id.title_and_name);

        TextView students = (TextView) findViewById(R.id.students);

        TextView courses = (TextView) findViewById(R.id.courses);

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
