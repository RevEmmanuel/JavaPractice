package ChibuzorAssignment.contactInfo;

public class ContactDoesNotExistException extends RuntimeException{

    public ContactDoesNotExistException(String message) {
        super(message);
    }

    public ContactDoesNotExistException() {
        this("Contact does not exist");
    }

    public ContactDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContactDoesNotExistException(Throwable cause) {super(cause);}
}
