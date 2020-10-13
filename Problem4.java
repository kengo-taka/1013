import java.util.Scanner;

/**
 * Problem4
 */
public class Problem4 {

  public static void main(String[] args) {
    Scanner hello = new Scanner(System.in); 
    System.out.println("Enter the lengh from the center to a vertex");
    double length = hello.nextDouble();

    System.out.println("The area of the pentagon is " + (5*2*2*length*length*Math.sin(Math.PI/5)*Math.sin(Math.PI/5)) / (4*Math.tan(Math.PI/5)) );
  }
}