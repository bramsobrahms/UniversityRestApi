package be.brahms.models.entities.persons;

import be.brahms.models.entities.PersonEnt;
import be.brahms.models.entities.embedded.Address;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Objects;

@NoArgsConstructor @AllArgsConstructor
@Entity(name = "teacher" )
public class TeacherEnt extends PersonEnt {

    @Getter @Setter
    @Column(length = 50, nullable = false)
    private String title;

    @Override
    public String toString() {
        return "TeacherEnt{" +
                super.toString() +
                "title='" + title + '\'' +
                '}';
    }

    public TeacherEnt(String title, String firstname, String lastname, Address address){
        super(firstname, lastname, address);
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TeacherEnt that = (TeacherEnt) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }
}
