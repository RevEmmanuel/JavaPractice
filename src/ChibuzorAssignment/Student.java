package ChibuzorAssignment;

public class Student {

    public static int numberOfStudents = 0;
    private String studentId;
    private String studentName;
    private Subject[] subjects;

    public Student(String studentName, Subject[] subjects) {
        this.studentId = String.valueOf(numberOfStudents++);
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
