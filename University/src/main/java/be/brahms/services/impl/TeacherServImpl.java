package be.brahms.services.impl;

import be.brahms.exceptions.teacher.NotFoundTeacherException;
import be.brahms.models.entities.persons.TeacherEnt;
import be.brahms.repositories.AddressRep;
import be.brahms.repositories.TeacherRepo;
import be.brahms.services.TeacherServ;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServImpl implements TeacherServ {

    private final TeacherRepo teacherRepo;
    private final AddressRep addressRep;

    public TeacherServImpl(TeacherRepo teacherRepo, AddressRep addressRep) {
        this.teacherRepo = teacherRepo;
        this.addressRep = addressRep;
    }

    @Override
    public TeacherEnt create(TeacherEnt teacher) {
        teacher.setId(teacher.getId()+"007");
        return teacherRepo.save(teacher);
    }

    @Override
    public TeacherEnt findById(String id) {
        if(!teacherRepo.existsById(id)){
            throw new NotFoundTeacherException();
        }
        return teacherRepo.findById(id).orElseThrow();
    }

    @Override
    public List<TeacherEnt> findAll() {
        return teacherRepo.findAll();
    }
}
