package be.brahms.models.dtos.course;

import be.brahms.models.entities.CourseEnt;

public record CourseShortDTO (
        String id,
        String name
){
    public static CourseShortDTO fromEntity(CourseEnt course){
        return new CourseShortDTO(course.getId(), course.getName());
    }
}
