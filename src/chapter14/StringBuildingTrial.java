package chapter14;

public class StringBuildingTrial {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, how are you doing?");

        System.out.printf("Content: %s%nLength: %d%nCapacity: %d%n", builder, builder.length(), builder.capacity());

        builder.ensureCapacity(75);
        System.out.println("New capacity is " + builder.capacity());
        builder.ensureCapacity(100);
        System.out.println("New capacity is " + builder.capacity());
        builder.setLength(20);
        System.out.println("New content is " + builder);
    }
}
