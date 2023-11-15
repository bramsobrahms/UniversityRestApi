package be.brahms.models.forms;

import be.brahms.models.entities.embedded.Address;
import be.brahms.models.entities.persons.TeacherEnt;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TeacherForm {

    private String title;
    private String firstname;
    private String lastname;
    private Address address;

    public TeacherEnt toEntity(){
        return new TeacherEnt(this.title, this.firstname,this.lastname,this.address);
    }
}
