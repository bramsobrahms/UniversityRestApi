package be.brahms.exceptions.course;

public class AlreadyExistCourseException extends CourseException{

    public AlreadyExistCourseException(){
        super("Il existe déjà un cours avec ce nom.");
    }
    public AlreadyExistCourseException(String message) {
        super(message);
    }
}
