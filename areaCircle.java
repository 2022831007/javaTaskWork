import java.util.Scanner;
public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Input the radius:");
        int radius = sc.nextInt();

        
        double pi = 3.1416;

        
        double area = pi*Math.pow(radius,2);

        
        System.out.println("The area of the circle is: " + area);

        
    }
}

 

