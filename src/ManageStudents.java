import java.util.Scanner;

public class ManageStudents {
    public static void main(String[] args) {
        Student demoStudent = Student.creatStudent();
        Student.showInformationOfStudent(demoStudent);
        Student.processGPA(demoStudent);
    }
}
