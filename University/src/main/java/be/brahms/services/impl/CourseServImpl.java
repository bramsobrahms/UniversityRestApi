package be.brahms.services.impl;

import be.brahms.exceptions.course.AlreadyExistCourseException;
import be.brahms.exceptions.course.NotFoundCourseException;
import be.brahms.models.entities.CourseEnt;
import be.brahms.repositories.CourseRepo;
import be.brahms.services.CourseServ;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CourseServImpl implements CourseServ {

    private final CourseRepo courseRepo;

    public CourseServImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }


    @Override
    public CourseEnt create(CourseEnt course) {
        if(courseRepo.existsByName(course.getName())){
            throw new AlreadyExistCourseException();
        }
        String mnemo;
        do {
            Random rng = new Random();
            mnemo = course.getName().substring(0,2) + rng.nextInt(10,100);
        }while(courseRepo.existsById(mnemo));

        course.setId(mnemo);

        return courseRepo.save(course);
    }

    @Override
    public CourseEnt findById(String id) {
        return courseRepo.findById(id).orElseThrow(NotFoundCourseException::new);
    }

    @Override
    public List<CourseEnt> findAll() {
        return courseRepo.findAll();
    }
}
