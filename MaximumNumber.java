import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            maxi = Math.max(arr[i], maxi);
        }
        System.out.println("The maximum number of the array is: " + maxi);
    }
}
