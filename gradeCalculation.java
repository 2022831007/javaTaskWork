import java.util.Scanner;

public class gradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your score: ");
        int score = sc.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Invalid score!");
        } else if (score >= 90) {
            System.out.println("Grade: A+");
        } else if (score >= 80) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: A-");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else if (score >= 40) {
            System.out.println("Grade: C+");
        } else {
            System.out.println("Grade: F");
        }

        
    }
}
