package it.polimi.models;

import com.androidrecord.ActiveCollection;
import com.androidrecord.relations.BelongsTo;
import com.androidrecord.relations.HasMany;

import java.util.ArrayList;

public class Student extends Person<Student> {
    public Long matriculation_number;

    @BelongsTo
    public Teacher adviser;

    @HasMany(name = "student", relatedType = Enrollment.class)
    public ActiveCollection<Enrollment> enrollments;

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Course> getCoursesTaken() {
        ArrayList<Course> coursesTaken = new ArrayList<Course>();
        for (Enrollment enrollment : enrollments) {
            coursesTaken.add(enrollment.course);
        }
        return coursesTaken;
    }
}
