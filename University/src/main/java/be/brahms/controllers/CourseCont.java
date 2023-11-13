package be.brahms.controllers;

import be.brahms.models.dtos.course.course.CourseDTO;
import be.brahms.models.entities.CourseEnt;
import be.brahms.models.forms.CourseForm;
import be.brahms.services.CourseServ;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/course")
public class CourseCont {
        private final CourseServ courseService;

        public CourseCont(CourseServ courseServ){
            this.courseService = courseServ;
        }

        @PostMapping(path = "")
        public ResponseEntity<CourseEnt> create (@RequestBody @Valid CourseForm form){
            CourseEnt course = courseService.create(form.toEntity());
            return ResponseEntity.ok(course);
        }

        @GetMapping(path = "/{id}")
        public ResponseEntity<CourseDTO> findById(@PathVariable String id){
            CourseEnt course = courseService.findById(id);
            CourseDTO dto = CourseDTO.fromEntity(course);
            return ResponseEntity.ok(dto);
        }
}
