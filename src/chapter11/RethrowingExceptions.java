package chapter11;

public class RethrowingExceptions {

    public static void main(String[] args) {
        try {
            someMethod();
        }
        catch (ValidationException exception) {
            exception.printStackTrace();
        }

        try {
            someMethod3();
        }
        catch (Exception exception) {
            System.out.println("Exception caught in outer scope.");
        }
    }

    public static void someMethod() {
        try {
            someMethod2();
        }
        catch (ValidationException validationException) {
            System.out.println("Exception caught and rethrown.");
            throw validationException;
        }
    }

    public static void someMethod2() {
        throw new ValidationException("Throwing exception -1");
    }

    public static void someMethod3() {
        try {
         someMethod4();
        }
        catch (ValidationException  validationException) {
            System.out.println("Wrong exception caught.");
        }
    }

    public static void someMethod4() {
        throw new IllegalArgumentException("Welcome to some method.");
    }
}
