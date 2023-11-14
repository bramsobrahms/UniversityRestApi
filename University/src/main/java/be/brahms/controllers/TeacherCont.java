package be.brahms.controllers;


import be.brahms.models.entities.persons.TeacherEnt;
import be.brahms.models.forms.AddressForm;
import be.brahms.models.forms.TeacherForm;
import be.brahms.services.TeacherServ;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = "/teacher")
public class TeacherCont {

    private final TeacherServ teacherServ;

    public TeacherCont(TeacherServ teacherServ) {
        this.teacherServ = teacherServ;
    }

    @PostMapping
    public ResponseEntity<TeacherEnt> createTeacher(@RequestBody @Valid TeacherForm form, AddressForm formAd){
        TeacherEnt teacher = teacherServ.create(form.toEntity());
        teacher.setAddress(formAd.toEntity());
        return ResponseEntity.ok(teacher);
    }

    @GetMapping(path ="/{id}")
    public ResponseEntity<TeacherEnt> findByIdTeacher(@PathVariable String id){
        TeacherEnt teacher = teacherServ.findById(id);
        return ResponseEntity.ok(teacher);
    }

}
