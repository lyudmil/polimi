package it.polimi.screens.enrollment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import it.polimi.R;

public class NewEnrollment extends Activity {

    protected Spinner courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_enrollment);

        courses = (Spinner) findViewById(R.id.courses);

        Button enroll = (Button) findViewById(R.id.enroll);
        enroll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
