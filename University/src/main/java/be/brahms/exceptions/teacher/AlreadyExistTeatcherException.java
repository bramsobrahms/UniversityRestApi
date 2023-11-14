package be.brahms.exceptions.teacher;

public class AlreadyExistTeatcherException extends TeacherException{

    public AlreadyExistTeatcherException(){
        super("L'id du prof existe déjà");
    }

}
