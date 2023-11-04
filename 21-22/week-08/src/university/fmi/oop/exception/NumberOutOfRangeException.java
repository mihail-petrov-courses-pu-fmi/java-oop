package university.fmi.oop.exception;

/**
 * Custom exception that describes numbers that are out of range
 */
public class NumberOutOfRangeException extends Exception {

    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
