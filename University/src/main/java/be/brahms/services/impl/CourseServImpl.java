package be.brahms.services.impl;

import be.brahms.models.entities.CourseEnt;
import be.brahms.repositories.CourseRepo;
import be.brahms.services.CourseServ;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServImpl implements CourseServ {

    private final CourseRepo courseRepo;

    public CourseServImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }


    @Override
    public CourseEnt create(CourseEnt course) {
        return null;
    }

    @Override
    public CourseEnt findById(String id) {
        return null;
    }

    @Override
    public List<CourseEnt> findAll() {
        return null;
    }
}
