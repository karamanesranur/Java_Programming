package Java_Programming_Muhtar.day038_ExceptionHandling.ShapeTasks;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }
}
