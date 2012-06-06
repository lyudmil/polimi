package it.polimi.models;

import com.androidrecord.ActiveRecordBase;
import com.androidrecord.associations.BelongsTo;

public class Enrollment extends ActiveRecordBase<Enrollment> {

    @BelongsTo
    public Student student;

    @BelongsTo
    public Course course;

}
