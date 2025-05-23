
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0, q= 1;
        for(int i = 0; i < n; i++){
            System.out.print(p + " ");
            int s = p + q;
            p = q;
            q = s;
        }
    }
}
