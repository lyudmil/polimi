package it.polimi.models;

import com.androidrecord.relations.BelongsTo;

public class Student extends Person<Student> {
    public Long matriculation_number;

    @BelongsTo
    public Teacher adviser;
}
