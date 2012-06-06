package it.polimi.models;

import com.androidrecord.ActiveCollection;
import com.androidrecord.ActiveRecordBase;
import com.androidrecord.associations.BelongsTo;
import com.androidrecord.associations.HasMany;

import java.util.ArrayList;

public class Course extends ActiveRecordBase<Course> {

    public String name;
    public String description;

    @BelongsTo
    public Teacher teacher;

    @HasMany(name = "course", relatedType = Enrollment.class)
    public ActiveCollection<Enrollment> enrollments;

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Student> getEnrolledStudents() {
        ArrayList<Student> enrolledStudents = new ArrayList<Student>();
        for (Enrollment enrollment : enrollments) {
            enrolledStudents.add(enrollment.student);
        }
        return enrolledStudents;
    }
}
