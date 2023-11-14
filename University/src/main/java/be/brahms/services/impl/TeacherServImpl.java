package be.brahms.services.impl;

import be.brahms.exceptions.teacher.AlreadyExistTeatcherException;
import be.brahms.exceptions.teacher.NotFoundTeacherException;
import be.brahms.models.entities.persons.TeacherEnt;
import be.brahms.repositories.TeacherRepo;
import be.brahms.services.TeacherServ;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TeacherServImpl implements TeacherServ {

    private final TeacherRepo teacherRepo;

    public TeacherServImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public TeacherEnt create(TeacherEnt teacher) {
//        if(teacherRepo.existsById(teacher.getId())){
//            throw new AlreadyExistTeatcherException();
//        }
        String id;

        do{
            Random rng = new Random();
            //String newId = teacher.getId().substring(0,2) + rng.nextInt(5,10);

            id = "bonjourisdf";
        }while (teacherRepo.existsById(id));

        teacher.setId(id);
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
