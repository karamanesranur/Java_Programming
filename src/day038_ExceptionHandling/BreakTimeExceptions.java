package Java_Programming_Muhtar.day038_ExceptionHandling;

public class BreakTimeExceptions extends RuntimeException{

    public BreakTimeExceptions(){
        super("It' s break time");
    }

    public BreakTimeExceptions(String message){
        super(message);
    }


}
