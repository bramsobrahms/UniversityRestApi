package be.brahms.models.dtos.course.branch;

import be.brahms.models.entities.BranchEnt;

public record BranchDTO(
        String id,
        String name

) {
    public static BranchDTO fromEntity(BranchEnt branch){
        return new BranchDTO(branch.getId(), branch.getName());
    }
}
