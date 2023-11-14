package be.brahms.services;

import be.brahms.models.entities.persons.TeacherEnt;

import java.util.List;

public interface TeachterServ {

    TeacherEnt create(TeacherEnt teacher);

    TeacherEnt findById(String id);

    List<TeacherEnt> findAll();
}
