import java.util.Scanner;
public class areaTriangle2 {
  public  static void  main(String[] args){
 Scanner sc= new Scanner(System.in);
 System.out.println("input the three numbers:");
 double a=sc.nextDouble();
 double b=sc.nextDouble();
 double c=sc.nextDouble();
double s = (a+b+c)/2;
double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
System.out.println("the area of the triangle is:" +area);


  }  
}
