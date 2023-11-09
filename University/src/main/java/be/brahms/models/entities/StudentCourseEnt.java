package be.brahms.models.entities;

import be.brahms.models.entities.persons.StudentEnt;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString @EqualsAndHashCode
@Entity(name = "studentCourse")
public class StudentCourseEnt extends BaseRelationEnt <StudentCourseEnt.StudentCourseId> {

    @Getter @Setter
    @ManyToOne(targetEntity = StudentEnt.class, fetch = FetchType.EAGER)
    @MapsId("studentId")
    private StudentEnt student;

    @Getter @Setter
    @ManyToOne(targetEntity = CourseEnt.class, fetch = FetchType.EAGER)
    @MapsId("courseId")
    private CourseEnt course;

    @Getter @Setter
    @Column(nullable = false)
    private int year;

    @Embeddable
    public static class StudentCourseId implements Serializable{

        @Getter @Setter
        private String studentId;

        @Getter @Setter
        private String courseId;

    }
}
