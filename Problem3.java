import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Arrays;

/**
 * Problem3
 */
public class Problem3 {

  public static void main(String[] args) {
    String arr [] = new String[3];

    Scanner hello = new Scanner(System.in); 
    System.out.println("Enter the first city");
    String cityFirst = hello.nextLine();
    System.out.println("Enter the second city");
    String citySecond = hello.nextLine();
    System.out.println("Enter the third city");
    String cityThird = hello.nextLine();

    arr[0] = cityFirst;
    arr[1] = citySecond;
    arr[2] = cityThird;


Arrays.sort(arr);

System.out.println("The three cities in alpabetical order are " + arr[0] + " " + arr[1] + " " + arr[2]);
  }
  
}