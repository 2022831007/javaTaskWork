
import java.util.Scanner;
public class averageValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double)sum / (double)n;
        System.out.println("The average value is: " + avg);
    }
}
