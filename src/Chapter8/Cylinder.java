package Chapter8;

// (Cylinder Class) Create a class Cylinder with attributes radius and height, each of
//which has a default value of 1. Provide a method that calculates the cylinders’ volume, which
//is pi multiplied by the square of the radius multiplied by the height. It has set and get methods
// for both radius and height. The set method should verify that radius and height are positive numbers.
// Write a program to test class Cylinder

public class Cylinder {

    private int radius;
    private int height;

    public Cylinder() {
        this(1, 1);
    }
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int radius) {
//        if (radius <= 0) {
//            throw new IllegalArgumentException("Enter a value greater than or equal to 1.");
//        }
        if (radius >= 1) {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
//        if (height <= 0) {
//            throw new IllegalArgumentException("Enter a value greater than or equal to 1.");
//        }
        if (height >= 1) {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public double volumeIs() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

}
