package be.brahms.exceptions.teacher;

public class NotFoundTeacherException extends TeacherException{
    public NotFoundTeacherException() {
        super("L'id de ce professeur n'existe pas dans la DB");
    }
}
