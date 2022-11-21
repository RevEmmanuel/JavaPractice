package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {

    private final Pen pen;
    private Direction currentDirection;
    private final Position currentPosition;
    private final int[][] sketchPad;

    public Turtle() {
        pen = new Pen();
        pen.penUp();
        currentDirection = EAST;
        sketchPad = new int[20][20];
        currentPosition = new Position(0, 0);
    }

    public void penUp() {
        pen.penUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void move(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1 -> penUp();
                case 2 -> penDown();
                case 3 -> turnRight();
                case 4 -> turnLeft();
                case 5 -> moveSteps(numbers[++i]);
                case 6 -> display();
                case 9 -> System.out.println("Commands executed.");
            }
        }
    }

    public void moveSteps(int numberOfSteps) {
        switch (currentDirection) {
            case EAST -> {
                for (int j = currentPosition.getColumn(); j < currentPosition.getColumn() + numberOfSteps; j++) {
                    if (!isPenUp()) {
                        sketchPad[currentPosition.getRow()][j] = 1;
                    }
                }
                currentPosition.setColumn(currentPosition.getColumn() + numberOfSteps);
            }
            case SOUTH -> {
                for (int i = currentPosition.getRow(); i < currentPosition.getRow() + numberOfSteps; i++){
                    if (!isPenUp()) {
                        sketchPad[i][currentPosition.getColumn()] = 1;
                    }
                }
                currentPosition.setRow(currentPosition.getRow() + numberOfSteps);
            }
            case WEST -> {
                for (int j = currentPosition.getColumn(); j > currentPosition.getColumn() - numberOfSteps; j--) {
                    if (!isPenUp()) {
                        sketchPad[currentPosition.getRow()][j] = 1;
                    }
                }
                currentPosition.setColumn(currentPosition.getColumn() - numberOfSteps);
            }
            case NORTH -> {
                for (int i = currentPosition.getRow(); i > currentPosition.getRow() - numberOfSteps; i--){
                    if (!isPenUp()) {
                        sketchPad[i][currentPosition.getColumn()] = 1;
                    }
                }
                currentPosition.setRow(currentPosition.getRow() - numberOfSteps);
            }
        }
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
            case NORTH -> face(WEST);
        }
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void display() {
        for (int[] sketch: sketchPad) {
            for (int aSketch : sketch) {
                if (aSketch == 1) System.out.print(" + ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}
