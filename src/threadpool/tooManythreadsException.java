package threadpool;

public class tooManythreadsException extends Exception{
    public tooManythreadsException(String message) {
        super(message);
    }
}
