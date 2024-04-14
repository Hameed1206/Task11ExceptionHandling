package javatasks;
import java.util.Scanner;
//QUE 4
public class ArithmeticExcept{
    
    public static void main(String[] args) {
        try {
            // Create a Scanner object to read user input
            Scanner s = new Scanner(System.in);

            // Prompt the user to enter two integers
            System.out.println("Enter two integers:");

            // Read the input values
            int a = s.nextInt();
            int b = s.nextInt();

            // Perform division
            int c = a / b;

            // Print the result
            System.out.println("Result of division: " + c);
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            e.printStackTrace(); // Print the stack trace of the exception
            System.out.println("Cannot divide: " + e.getMessage()); // Print a user-friendly error message
            System.out.println(e.getClass()); // Print the class of the exception
        }
    }
}
