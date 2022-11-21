package TurtleGraphics;

public class Pen {

    private boolean isPenUp;

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }
}
