package ClassActivity;

public class IPhone {

    private String color;
    private static double price;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void setPrice(double price) { IPhone.price = price; }

    public double getPrice() {
        return price;
    }
}
