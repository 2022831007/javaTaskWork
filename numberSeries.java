//for loop
public class numberSeries {
    public static void main(String[] args) {
        int sumEven = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            sumEven += i;
        }
        System.out.println("Sum of even numbers: " + sumEven);
        int sumOdd = 0;
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
            sumOdd += i;
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
