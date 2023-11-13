package be.brahms.models.dtos.course.course;

import be.brahms.models.entities.CourseEnt;

public record CourseDTO(
        String id,
        String name,
        String summary
) {
    public static CourseDTO fromEntity(CourseEnt course){
        return new CourseDTO(course.getId(), course.getName(), course.getSummary());
    }
}
