public class seriesWhileLoop {
    public static void main(String[] args) {
        int sumEven = 0;
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        }
        System.out.println("Sum of even numbers: " + sumEven);
        int sumOdd = 0;
        int j = 1;
        while (j <= 19) {
            System.out.print(j + " ");
            sumOdd += j;
            j += 2;
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
