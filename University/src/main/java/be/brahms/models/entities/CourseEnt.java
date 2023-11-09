package be.brahms.models.entities;

import be.brahms.models.entities.persons.TeacherEnt;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString( of = {"name", "summary"} ) @EqualsAndHashCode( of = {"name","summary"}, callSuper = false)
@Entity(name = "course")
public class CourseEnt  extends BaseEnt<String>{

    @Getter @Setter
    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @Getter @Setter
    private String summary;

    @Getter @Setter
    @ManyToOne(targetEntity = TeacherEnt.class, fetch = FetchType.EAGER)
    private TeacherEnt teacher;

    public CourseEnt(String name, String summary){
        this.name = name;
        this.summary = summary;
    }

}
