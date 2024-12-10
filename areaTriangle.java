import java.util.Scanner;
public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the base number:");
        int base=sc.nextInt();
        System.out.println("input the base number:");
        int height=sc.nextInt();
        float area=(float) 0.5*base*height;
        System.out.println(area);
    }
}