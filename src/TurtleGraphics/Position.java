package TurtleGraphics;

public class Position {

    private int row;
    private int column;


    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
       String stringFormat = "";
       stringFormat += "Row: " + row + "\n";
       stringFormat += "Column: " + column + "\n";
       return stringFormat;
    }

    @Override
    public boolean equals(Object object) {
        try {
            Position comparedObject = (Position) object;
            return (comparedObject.row == this.row && comparedObject.column == this.column);
        }
        catch (ClassCastException e) {
            System.out.println("Cannot cast argument to Position object");
            return false;
        }
    }
}
