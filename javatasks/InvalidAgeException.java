package javatasks;
import java.util.Scanner;
//QUE 7
public class InvalidAgeException extends Exception {
    
    static int age; // Declare a static variable to store age
    
    // Constructor to initialize the exception with a message
    public InvalidAgeException(String exceptionMessage ){
        super(exceptionMessage);
    }
    public static void main(String[] args) throws InvalidAgeException {
        // Create an instance of InvalidAgeException with a custom message
        InvalidAgeException iException = new InvalidAgeException("Sorry Invalid age, please enter the age above 18");

        // Create a Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("Enter your age:");

        // Read the age input
        age = s.nextInt();

        try {
            // Check if the age is 18 or above
            if (age >= 18) {
                System.out.println("Allow the user"); // If age is valid, allow the user
            } else {
                // If age is invalid, throw the custom exception
                throw iException;
            }
        } catch (InvalidAgeException e) {
            // Catch and handle the InvalidAgeException
            e.printStackTrace(); // Print the stack trace of the exception
            System.out.println(e.getMessage()); // Print the error message
            System.out.println(e.getClass()); // Print the class of the exception
        }   
    }
}
