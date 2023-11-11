package be.brahms.services;

import be.brahms.models.entities.BranchEnt;

public interface BranchServ {

    BranchEnt create(BranchEnt branch);

    void addCourse(String branchId, String courseId);
}
