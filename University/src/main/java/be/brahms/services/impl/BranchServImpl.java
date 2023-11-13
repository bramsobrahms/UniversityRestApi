package be.brahms.services.impl;

import be.brahms.models.entities.BranchEnt;
import be.brahms.models.entities.CourseEnt;
import be.brahms.repositories.BranchRepo;
import be.brahms.repositories.CourseRepo;
import be.brahms.services.BranchServ;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if(branchRepo.existsByName(branch.getName())){
            throw new RuntimeException();
        }
        branch.setId(branch.getName()+ "007");
        return branchRepo.save(branch);
    }

    @Override
    public void addCourse(String branchId, String courseId) {
        BranchEnt branch = branchRepo.findById(branchId).orElseThrow();
        CourseEnt course = courseRepo.findById(courseId).orElseThrow();
        branch.addCourse(course);
        branchRepo.save(branch);
    }

    @Override
    public List<BranchEnt> listeBranch(){
        return branchRepo.findAll();
    }
}
