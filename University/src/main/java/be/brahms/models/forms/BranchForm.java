package be.brahms.models.forms;

import be.brahms.models.entities.BranchEnt;
import lombok.Data;

import java.util.Set;

@Data
public class BranchForm {

    private String name;
    private Set<String> courseIds;
    private BranchEnt toEntity(){
        return new BranchEnt(this.name);
    }
}
