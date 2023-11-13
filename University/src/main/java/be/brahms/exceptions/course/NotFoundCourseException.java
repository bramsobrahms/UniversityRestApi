package be.brahms.exceptions.course;

public class NotFoundCourseException extends CourseException{

    public NotFoundCourseException(){
        super("ce cours n'est pas retrouvé! ");
    }
    public NotFoundCourseException(String message) {
        super(message);
    }
}
