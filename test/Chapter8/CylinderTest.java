package Chapter8;

import java.util.Scanner;


class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = input.nextInt();
        cylinder.setRadius(radius);

        System.out.println("Enter the height: ");
        int height = input.nextInt();
        cylinder.setHeight(height);

        System.out.printf("Radius is %d and height is %d%nTherefore, volume is %.2f", cylinder.getRadius(), cylinder.getHeight(), cylinder.volumeIs());
    }
}