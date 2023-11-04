package university.fmi.oop.exception;

/**
 * An exception that describes invalid confirmation input from the user of the system
 */
public class InvalidChoiceException extends Exception {

    public InvalidChoiceException(String message) {
        super(message);
    }
}
