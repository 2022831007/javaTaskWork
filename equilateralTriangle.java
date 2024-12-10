import java.util.Scanner;

public class equilateralTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("input the side length of the equilateral triangle:");
        double arm = sc.nextDouble();

        
        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);

    
        System.out.printf("the area of the equilateral triangle is: "+ area);

    
    }
}
