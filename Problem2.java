/**
 * Problem2
 */
import java.util.Scanner; 
public class Problem2 {

  public static void main(String[] args) {

    
    Scanner hello = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter emplyee's name");
    String name = hello.nextLine();

    System.out.println("Enter number of hours worked in a week");
    int numberHour = hello.nextInt();

    System.out.println("Enter hourly pay rate");
    double payRate  = hello.nextDouble();

    System.out.println("Enter federal tax withholding rate");
    double taxFederal = hello.nextDouble();

    System.out.println("Enter state tax withholding rate");
    double taxState = hello.nextDouble();

   System.out.println("Employee Name: " + name);
   System.out.println("Hours Worked: " + numberHour);
   System.out.println("Pay Rate: $" + payRate);
   System.out.println("Gross Pay: $" + numberHour*payRate);
   System.out.println("Deductions:");
   System.out.println("Federal Withholding (" + taxFederal*100 + "%): " + "$" + numberHour*payRate*taxFederal);
   System.out.println("State Withholding (" + taxState*100 + "%): " + "$" + numberHour*payRate*taxState);
   System.out.println("Total Deduction: $" + ((numberHour*payRate*taxFederal) + (numberHour*payRate*taxState)));
   System.out.println("Net Pay: $" + ((numberHour*payRate) - (numberHour * payRate * taxFederal) - (numberHour * payRate * taxState)));






  }
}