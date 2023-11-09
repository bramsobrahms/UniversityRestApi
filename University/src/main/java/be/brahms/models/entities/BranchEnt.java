package be.brahms.models.entities;

import be.brahms.models.entities.persons.TeacherEnt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "branch")
public class BranchEnt extends BaseEnt<String> {

    @Getter @Setter
    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @Getter @Setter
    @OneToOne( targetEntity = TeacherEnt.class, fetch = FetchType.EAGER)
    private TeacherEnt teacher;

    @ManyToMany( targetEntity = CourseEnt.class, fetch = FetchType.LAZY)
    private Set<CourseEnt> courses;


    public BranchEnt(){
        this.courses = new HashSet<>();
    }

    public BranchEnt(String name){
        this();
        this.name = name;
    }


    public Set<CourseEnt> getCourses() {
        return Set.copyOf(this.courses);
    }

    public void addCourse(CourseEnt course){
        this.courses.add(course);
    }

    public void removeCourse(CourseEnt course){
        this.courses.remove(course);
    }

    //Dans le cas ou on ne veut pas tout prendre en compte : @ToString(of = {...})
    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BranchEnt branch = (BranchEnt) o;
        return Objects.equals(name, branch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
