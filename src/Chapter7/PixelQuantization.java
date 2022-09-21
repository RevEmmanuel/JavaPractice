package Chapter7;

// Use a one-dimensional array to solve the following problem: You want
//to eventually perform some basic compression on an image. Assume that you will only be operating
//on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
//are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
//in a range will assume a value in that range as indicated below. This creates redundancy that can lead
//to better compression. Overwrite the original values in the array.
//a) For 0–20: 10
//b) For 21–40: 30
//c) For 41–60: 50
//d) For 61–80: 70
//e) For 81–100: 90
//f) For 101–120: 110
//g) For 121–140: 130
//h) For 141–160: 150
//i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
//Print the array with the new, quantized values
public class PixelQuantization {

    public static void main(String[] args) {
        int[] pixel = {15, 18, 22, 27, 44, 98, 183, 195, 179, 164, 148, 139, 111, 75, 86};
        for (int count : pixel) {
            System.out.printf("%d   ", count);
        }
        System.out.println();

        for (int counter = 0; counter < pixel.length; counter++) {
            switch (pixel[counter] / 20) {
                case 0 -> pixel[counter] = 10;
                case 1 -> pixel[counter] = 30;
                case 2 -> pixel[counter] = 50;
                case 3 -> pixel[counter] = 70;
                case 4 -> pixel[counter] = 90;
                case 5 -> pixel[counter] = 110;
                case 6 -> pixel[counter] = 130;
                case 7 -> pixel[counter] = 150;
                case 8 -> pixel[counter] = 170;
                default -> pixel[counter] = 190;
            }
        }

        for (int count : pixel) {
            System.out.printf("%d   ", count);
        }
    }
}
