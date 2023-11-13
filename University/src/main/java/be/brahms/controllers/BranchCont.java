package be.brahms.controllers;

import be.brahms.models.entities.BranchEnt;
import be.brahms.models.entities.CourseEnt;
import be.brahms.models.forms.BranchForm;
import be.brahms.services.BranchServ;
import be.brahms.services.CourseServ;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchCont {

    private final BranchServ branchService;
    private final CourseServ courseService;


    public BranchCont(BranchServ branchService, CourseServ courseService){
        this.branchService = branchService;
        this.courseService = courseService;
    }

    @GetMapping(path = "")
    public ResponseEntity<List<BranchEnt>> listBranch(){
        List<BranchEnt> listsBranch = branchService.listeBranch();
        return ResponseEntity.ok(listsBranch);
    }

    @PostMapping
    public ResponseEntity<BranchEnt> createBranch(@RequestBody @Valid BranchForm form){
        BranchEnt newBranch = form.toEntity();
        for(String courseId : form.getCourseIds()){
            CourseEnt course = courseService.findById(courseId);
            newBranch.addCourse(course);
        }
        BranchEnt branch = branchService.create(newBranch);
        return ResponseEntity.ok(branch);
    }

    @PutMapping
    public ResponseEntity<Object> addCourse( @RequestParam String branchId, @RequestParam String courseId){
        branchService.addCourse(branchId, courseId);
        return ResponseEntity.status(200).body("Accepted");
    }
}
