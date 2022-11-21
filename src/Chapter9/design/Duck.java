package Chapter9.design;

public class Duck {

    private Flyable fly;
    private Quackable quack;

    public Duck(Flyable fly, Quackable quack) {
        this.fly =fly;
        this.quack = quack;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }

    public void quack() {
        quack.quack();
    }

    public void fly() {
        fly.fly();
    }
}
