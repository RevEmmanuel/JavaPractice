package Chapter7;

public class GradeBook {

    private String courseName;
    private int[][] grade;

    public GradeBook (String courseName, int[][] grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printGradesData() {
        System.out.printf("The name of the course is %s.%n%n", getCourseName());
        printGrades();
//        outputGrades();
//        System.out.printf("%nThe class average for %s is %.2f%n", getCourseName(), average(grade[0]));
        System.out.printf("%nThe lowest grade in the book is %d%nThe highest grade in  the book is %d%n", lowestGrade(), highestGrade());
        System.out.println();
        barChart();
    }

    public int lowestGrade() {
        int lowest = grade[0][0];
        for (int[] row : grade) {
            for (int counter : row) {
                if (counter < lowest) {
                    lowest = counter;
                }
            }
        }
        return lowest;
    }

    public int highestGrade() {
        int highest = grade[0][0];
        for (int[] row : grade) {
            for (int counter : row) {
                if (counter > highest) {
                    highest = counter;
                }
            }
        }
        return highest;
    }

    public double average(int[] setOfGrades) {
        int total = 0;
        for (int counter : setOfGrades) {
            total += counter;
        }
        return (double) total / setOfGrades.length;
    }

    public void barChart() {
        System.out.println("Grade distribution");

        int[] frequency = new int[11];
        for (int[] row : grade) {
            for (int counter : row) {
                ++frequency[counter / 10];
            }
        }

        for (int counter = 0; counter < frequency.length; counter++) {
            if (counter == 10) {
                System.out.printf("%7d: ", 100);
            }
            else {
                System.out.printf("%02d - %02d: ", counter * 10, (counter * 10) + 9);
            }
            for (int star = 1; star <= frequency[counter]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printGrades() {
        System.out.println("The student grades are: ");
        System.out.print("                  ");

        for (int test = 0; test < grade[0].length; test++) {
            System.out.printf("Test %d      ", test + 1);
        }
        System.out.println("Average");
        for (int student = 0; student < grade.length; student++) {
            System.out.printf("Student %02d", student + 1);
            for (int column = 0; column < grade[student].length; column++) {
                System.out.printf("%12d", grade[student][column]);
            }
            System.out.printf("%14.2f", average(grade[student]));
            System.out.println();
        }
    }
}
/*
    public void outputGrades() {
        System.out.printf("The grades are:%n");
        System.out.print("                "); // align column heads

        // create a column heading for each of the tests
        for (int test = 0; test < grade[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }

        System.out.println("Average"); // student average column heading

        // create rows/columns of text representing array grades
        for (int student = 0; student < grade.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grade[student]) { // output student's grades
                System.out.printf("%8d", test);
            }

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = average(grade[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

 */

