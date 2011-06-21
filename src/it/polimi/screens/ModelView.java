package it.polimi.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.androidrecord.ActiveRecordBase;

public abstract class ModelView<T extends ActiveRecordBase> {
    protected Context context;
    protected T model;
    protected View view;

    public ModelView(Context context, T model) {
        this.model = model;
        this.context = context;
        view = LayoutInflater.from(context).inflate(getLayout(), null);
    }

    public abstract View show();

    protected abstract int getLayout();
}
