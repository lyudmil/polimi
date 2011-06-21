package it.polimi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import it.polimi.models.Student;

public class ViewStudent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);

        long id = getIntent().getExtras().getLong("id");
        final Student student = new Student().find(id);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(student.name);

        TextView matriculationNumber = (TextView) findViewById(R.id.matriculation_number);
        matriculationNumber.setText(student.matriculation_number.toString());

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                student.destroy();
                finish();
            }
        });
    }
}
