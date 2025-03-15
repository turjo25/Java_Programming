package fileio;
import java.io.*;

public class StudentReadWrite {
    private File file;

    public StudentReadWrite() {
        file = new File("file/Students.txt");
        // Ensure directory exists
        File directory = new File("file");
        if (!directory.exists()) {
            directory.mkdirs(); // Create directory if it doesn't exist
            System.out.println("Directory created: " + directory.getAbsolutePath());
        }
    }

    public void writeInFile(String s) {
        try {
            // Create the file if it does not exist
            if (!file.exists()) {
                file.createNewFile(); // Create file if it doesn't exist
                System.out.println("File created: " + file.getAbsolutePath());
            }

            // Use try-with-resources to automatically close the FileWriter
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(s + System.lineSeparator()); // Append text to the file
                System.out.println("Data written to file successfully.");
            }

        } catch (IOException ioe) {
            System.err.println("Error writing to file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    public void readFromFile() {
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try (FileReader reader = new FileReader(file);
             BufferedReader bfr = new BufferedReader(reader)) {

            StringBuilder text = new StringBuilder();
            String temp;

            // Read all lines from the file and append them to the StringBuilder
            while ((temp = bfr.readLine()) != null) {
                text.append(temp).append(System.lineSeparator());
            }

            // Print the content of the file
            System.out.println("File content:\n" + text.toString());
        } catch (IOException ioe) {
            System.err.println("Error reading from file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
