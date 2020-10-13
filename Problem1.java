import java.util.Scanner;
import java.io.*;


/**
 * Problem1
 */
public class Problem1 {

  public static void main(String[] args) {
    
    Scanner hello = new Scanner(System.in);  // Create a Scanner object
System.out.println("Enter a letter");
char name = hello.next().charAt(0);

if (name == 'a' || name == 'i' || name == 'u' || name == 'e'|| name == 'o' || name == 'A' || name == 'I' || name == 'U' || name == 'E' || name == 'O' ) {
System.out.println(name + " is a vowel");
}
else if (Character.isLetter(name)) {
  System.out.println(name + " is a consonant");
}
else {
  System.out.println(name + " is an invalid input");
}
  }
}

