package be.brahms.services.impl;

import be.brahms.models.entities.BranchEnt;
import be.brahms.repositories.BranchRepo;
import be.brahms.repositories.CourseRepo;
import be.brahms.services.BranchServ;
import org.springframework.stereotype.Service;

@Service
public class BranchServImpl implements BranchServ {

    private final BranchRepo branchRepo;
    private final CourseRepo courseRepo;

    public BranchServImpl(BranchRepo branchRepo, CourseRepo courseRepo){
        this.branchRepo = branchRepo;
        this.courseRepo = courseRepo;
    }

    @Override
    public BranchEnt create(BranchEnt branch) {
        return null;
    }

    @Override
    public void addCourse(String branchId, String courseId) {

    }
}
