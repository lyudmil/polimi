package it.polimi.models;

import com.androidrecord.ActiveRecordBase;

public class Student extends ActiveRecordBase<Student> {
    public String name;
    public Long matriculation_number;
}
