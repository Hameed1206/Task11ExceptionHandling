package javatasks;
//QUE 5
public class IndexOutOfBoundException {
    
    // Method to demonstrate ArrayIndexOutOfBoundsException
    static void arrayException(){
        try {
            // Create an array of size 3
            int[] i = new int[3];

            // Initialize array elements
            i[0] = 11;
            i[1] = 22;
            i[2] = 33;

            // Access an element at index 4
            System.out.println(i[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            e.printStackTrace(); // Print the stack trace of the exception
            System.out.println(e.getMessage()); // Print the error message
            System.out.println(e.getClass()); // Print the class of the exception
        }     System.out.println("===================================="); 
    }
    // Method to demonstrate StringIndexOutOfBoundsException
    static void stringException(){
        try {
            // Create a string
            String s = "Hello";

            // Access a character at index 5
            System.out.println(s.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle StringIndexOutOfBoundsException
            e.printStackTrace(); // Print the stack trace of the exception
            System.out.println(e.getMessage()); // Print the error message
            System.out.println(e.getClass()); // Print the class of the exception
        }
        System.out.println(""); 
    }

    public static void main(String[] args) {
        // Call the arrayException method
        arrayException();
        
        // Call the stringException method
        stringException();
    }
}

