package be.brahms.models.entities.persons;

import be.brahms.models.entities.BranchEnt;
import be.brahms.models.entities.PersonEnt;
import be.brahms.models.entities.StudentCourseEnt;
import be.brahms.models.entities.embedded.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "student")
public class StudentEnt extends PersonEnt {

    @OneToMany( mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<StudentCourseEnt> studentCourseSet;

    @Getter @Setter
    @ManyToOne(targetEntity = BranchEnt.class, fetch = FetchType.LAZY)
    private BranchEnt branch;

    public StudentEnt(){
        this.studentCourseSet = new HashSet<>();
    }

    public StudentEnt(String id, String firstname, String lastname, Address address){
        this();
        this.setId(id);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setAddress(address);
    }

    public Set<StudentCourseEnt> getStudentCourseSet(){
        return Set.copyOf(this.studentCourseSet);
    }

    public void addStudentCourse(StudentCourseEnt studentCourse){
        this.studentCourseSet.add(studentCourse);
        studentCourse.setStudent(this);
    }

    public void removeStudentCourse(StudentCourseEnt studentCourse){
        this.studentCourseSet.remove(studentCourse);
    }

    @Override
    public String toString(){
        return "Student { " + super.toString() + " } ";
    }

}
