package Chapter7;

//import static org.junit.jupiter.api.Assertions.*;

class GradeBookTest {

    public static void main(String[] args) {
       // int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int[][] gradesArray = {
                                 {87, 96,  70},
                                 {68, 87,  90},
                                 {94, 100, 90},
                                 {100, 81, 82},
                                 {83, 65,  85},
                                 {78, 87,  65},
                                 {85, 75,  83},
                                 {91, 94, 100},
                                 {76, 72,  84},
                                 {87, 93,  73}
                                };

        GradeBook myGradeBook = new GradeBook("Welcome to Java Programming", gradesArray);

        myGradeBook.setCourseName("Java Programming!");

        myGradeBook.printGradesData();
    }

}