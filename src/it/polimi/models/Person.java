package it.polimi.models;

import com.androidrecord.ActiveRecordBase;

public class Person extends ActiveRecordBase<Person> {
    public String first_name;
    public String middle_names;
    public String last_name;
    public long matriculation_number;
}
