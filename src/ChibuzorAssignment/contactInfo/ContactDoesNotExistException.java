package ChibuzorAssignment.contactInfo;

public class ContactDoesNotExistException extends RuntimeException{

    public ContactDoesNotExistException(String message) {
        super(message);
    }

    public ContactDoesNotExistException() {
        this("Contact does not exist");
    }
}
