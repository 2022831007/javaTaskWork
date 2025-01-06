import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the first number: ");
        int a = sc.nextInt();

        System.out.print("enter the second number: ");
        int b = sc.nextInt();

        System.out.print("enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("error!,division by zero is impossible!");
                }
                break;
            default:
                System.out.println("invalid operator!");
        }

        
    }
}
