package be.brahms.models.forms;

import be.brahms.models.entities.persons.TeacherEnt;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TeacherForm {

    @NotBlank
    private String title;

    public TeacherEnt toEntity(){
        return new TeacherEnt(this.title);
    }


}
