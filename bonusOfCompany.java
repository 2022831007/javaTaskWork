
import java.util.Scanner;
public class bonusOfComapny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetSales = sc.nextInt();
        int attendence = sc.nextInt();
        int bonus;
        if(targetSales >= 95 && attendence == 100){
      bonus = 60;
        }
        else if(targetSales >= 95 && attendence >= 90){
        bonus = 40;
        }
        else if(targetSales >= 80 && attendence == 100){
             bonus = 40;
        }
        else if(targetSales >= 80 && attendence >= 90){
             bonus = 20;
        }
        else {
        bonus = 5;
        }

        System.out.println("The Bonus is: " + bonus);
    }
}
