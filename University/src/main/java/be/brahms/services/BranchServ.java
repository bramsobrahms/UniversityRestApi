package be.brahms.services;

import be.brahms.models.entities.BranchEnt;

import java.util.List;

public interface BranchServ {

    BranchEnt create(BranchEnt branch);
    void addCourse(String branchId, String courseId);
    List<BranchEnt> listeBranch();
}
