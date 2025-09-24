package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Enter Student Name");
        student.name = sc.nextLine();
        student.firstTest = sc.nextDouble();
        student.secondTest = sc.nextDouble();
        student.thirdTest = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());
        if(student.finalGrade()<60.){
            System.out.println("Failed.");
            System.out.printf("Missing points : %.2f%n", student.missingPoints());
        }else {
            System.out.println("Passed.");
        }

    }
}
