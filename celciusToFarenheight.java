
import java.util.Scanner;

public class celciusToFarenheight {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the temperature in celcius:");
    float celcius = sc.nextFloat();
    double farenHeight = (9/5)*celcius+32;
    System.out.println("the farenheight number is" +farenHeight);
  }  
}
