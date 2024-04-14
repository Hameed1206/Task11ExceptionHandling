package javatasks;
//QUE 6
public class IncorrectPasswordException extends Exception {
    
     // Constructor to initialize the exception with a message
     public IncorrectPasswordException(String message){
        super(message);
    }
    // Method to validate the password field
    public void passwordField() throws IncorrectPasswordException{

        // Define the password and expected password
        String password = "GuviG33k";
        String expectedPassword = "Guvi_G33k";

        // Validate the password using a regular expression
        Boolean result = password.matches("([A-Za-z0-9]+[@$&*_]*){8,15}");
        System.out.println(result);

        // Check if the entered password matches the expected password
        if (expectedPassword.equals(password)) {
            System.out.println("Password Validated and logged in successfully");
        } else {
            // Throw IncorrectPasswordException if the passwords do not match
            throw new IncorrectPasswordException("Incorrect password, Please enter a valid password");
        }
    }
    public static void main(String[] args) {
        
        // Create an instance of IncorrectPasswordException
        IncorrectPasswordException iException = new IncorrectPasswordException("Incorrect password, Please enter valid password");

        try {
            // Call the passwordField method to validate the password
            iException.passwordField();
        } catch (Exception e) {
            try {
                // Handle the IncorrectPasswordException
                throw iException;
            } catch (IncorrectPasswordException e1) {
                e1.printStackTrace();
                System.out.println(e1.getMessage());
                System.out.println(e.getClass());
            }
        }
    }
}
