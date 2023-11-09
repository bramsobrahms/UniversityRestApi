package be.brahms.models.entities.persons;

import be.brahms.models.entities.BranchEnt;
import be.brahms.models.entities.PersonEnt;
import be.brahms.models.entities.StudentCourseEnt;
import be.brahms.models.entities.embedded.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "student")
public class StudentEnt extends PersonEnt {

    @OneToMany( mappedBy = "student", fetch = FetchType.LAZY )
    private Set<StudentCourseEnt> studentCourseSet = new HashSet<>();

    @Getter @Setter
    @ManyToOne(targetEntity = BranchEnt.class, fetch = FetchType.LAZY)
    private BranchEnt branch;

    public StudentEnt(String firstname, String lastname, Address address, Set<StudentCourseEnt> studentCourseSet, BranchEnt branch){
        this.setAddress(address);
        this.studentCourseSet = studentCourseSet;
        this.branch = branch;
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
