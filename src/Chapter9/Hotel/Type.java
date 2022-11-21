package Chapter9.Hotel;

public enum Type {
    EXECUTIVE(20000),
    CHEAP(10000),
    AWOYAYA(2500);

    private final int price;

    Type(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
