import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int salaryJava = 3000;
        int salaryQa = 2500;
        int salaryPm = 4000;
        int salaryJuniorJava = 800;
        int salary = 8;

        switch (salary) {
            case 800:
                System.out.println("you are junior java");
                break;
            case 2500:
                System.out.println("you are QA");
                break;
            case 3000:
                System.out.println("You are Java");
                break;
            case 4000:
                System.out.println("You are Pm");
                break;
            default:
                System.out.println("you are not recognizer");
                break;
        }
    }
}