package it.polimi.models;

import com.androidrecord.ActiveCollection;
import com.androidrecord.relations.HasMany;

public class Teacher extends Person<Teacher> {
    public String title;

    @HasMany(name = "adviser", relatedType = Student.class)
    public ActiveCollection<Student> students;

    @HasMany(name = "teacher", relatedType = Course.class)
    public ActiveCollection<Course> lectures;

    @Override
    public String toString() {
        return title + " " + name;
    }
}
