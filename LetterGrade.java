
import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your CGPA: ");
        float n = sc.nextFloat();
         if(n >= 3.5) System.out.println("Letter Grade");
        else System.out.println("NO Letter Grade");
    }
}
