package javatasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExcep {
    
    public static void main(String[] args) throws IOException {
        
        try {
            // Create a FileReader object to read from the specified file
            FileReader fReader = new FileReader("C:\\Users\\91936\\Desktop\\T A S K S\\Task Eleven\\file1.txt");
            
            // Read a character from the file
            fReader.read();
            
            // Close the FileReader
            fReader.close();
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            e.printStackTrace(); // Print the stack trace of the exception
            System.out.println("Expected file not found in the location " + e.getMessage()); // Print a user-friendly error message
            System.out.println(e.getClass()); // Print the class of the exception
        } 
    }
}
