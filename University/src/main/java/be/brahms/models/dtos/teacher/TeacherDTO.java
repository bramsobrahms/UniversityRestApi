package be.brahms.models.dtos.teacher;

import be.brahms.models.entities.persons.TeacherEnt;

public record TeacherDTO(
        String title,
        String firstname,
        String lastname
) {
    public static TeacherDTO fromEntity(TeacherEnt teacher){
        return new TeacherDTO(teacher.getId(), teacher.getFirstname(), teacher.getLastname());
    }
}
