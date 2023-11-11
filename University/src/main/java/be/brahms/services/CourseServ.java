package be.brahms.services;

import be.brahms.models.entities.CourseEnt;

import java.util.List;

public interface CourseServ {

    CourseEnt create(CourseEnt course);

    CourseEnt findById(String id);

    List<CourseEnt> findAll();
}
