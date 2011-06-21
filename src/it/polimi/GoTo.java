package it.polimi;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class GoTo implements View.OnClickListener {

    private Class activityClass;
    private Context context;
    private Long id;

    public GoTo(Context context, Class activityClass) {
        this(context, activityClass, null);
    }

    public GoTo(Context context, Class activityClass, Long id) {
        this.context = context;
        this.activityClass = activityClass;
        this.id = id;
    }

    public void onClick(View view) {
        Intent intent = new Intent(context, activityClass);
        if (id != null) intent.putExtra("id", id);

        context.startActivity(intent);
    }
}
