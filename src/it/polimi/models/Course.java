package it.polimi.models;

import com.androidrecord.ActiveRecordBase;
import com.androidrecord.relations.BelongsTo;

public class Course extends ActiveRecordBase<Course> {

    public String name;
    public String description;

    @BelongsTo
    public Teacher teacher;

    @Override
    public String toString() {
        return name;
    }
}
