package be.brahms.models.forms;

import be.brahms.models.entities.CourseEnt;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CourseForm {

    @NotBlank @Size(min = 2, max = 50)
    private String name;

    @Size(max = 255)
    private String summary;

    public CourseEnt toEntity(){
        return new CourseEnt(this.name, this.summary);
    }
}
