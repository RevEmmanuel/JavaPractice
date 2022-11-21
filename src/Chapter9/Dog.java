package Chapter9;

public class Dog extends Animal implements Movable{

    public Dog() {
        System.out.println("arg");
    }

    public Dog(int number) {
        super(number);
        System.out.println("argggggggg");
    }
    @Override
    public void speak() {
        System.out.println("I speak like a dog");
    }

    public void fathersSpeak() {
        super.speak();
    }

    @Override
    public void move() {
        System.out.println("A Dog walks");
    }
}
