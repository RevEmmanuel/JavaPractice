package chapter11;

public class UsingExceptions {

    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception exception) {
            System.out.println("Problem dey o");
            System.out.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] elements = exception.getStackTrace();
            System.out.printf("Stack trace from getStackTrace:%n");
            System.out.println("Class\t\t\t\t\t\tFile\t\t\t\t\tLine\tMethod");

            for (StackTraceElement element : elements) {
                System.out.printf("""
                        %s\t%s\t%s\t\t%s%n
                        """,
                element.getClassName(), element.getFileName(), element.getLineNumber(), element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception re) {
            throw new Exception("Exception in method1", re);
        }
    }

    public static void method2() throws Exception {
        try {
            method3();
        }
        catch (Exception e) {
            throw new Exception("Exception in method2", e);
        }
    }

    public static void method3() throws Exception {
        throw new Exception("Exception in method3");
    }
}
