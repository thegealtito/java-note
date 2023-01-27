import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
// file handling in java

public class JavaFile {
    public static void main(String[] args) {
        try {
            File newFile = new File("Hello.txt");
            if (newFile.createNewFile()){
                // file created successfully
                System.out.println("file created");
            } else {
                // file already exists
                System.out.println("file exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
