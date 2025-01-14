import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Input the radius:");
        int radius = sc.nextInt();

        
        double pi = 3.1416;

        
        double volume = (4 / 3) * pi * Math.pow(radius ,3);

        
        System.out.println("The volume of the ball is: " + volume);

        
    }
}

