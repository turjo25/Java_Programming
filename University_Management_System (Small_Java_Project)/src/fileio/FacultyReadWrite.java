package fileio;

import java.io.*;

public class FacultyReadWrite {
    private File file; // to create a File

    public FacultyReadWrite() {
        // Initialize the file and ensure directory exists
        file = new File("file/Faculties.txt");
        File directory = new File("file");
        if (!directory.exists()) {
            directory.mkdirs(); // Create the directory if it does not exist
        }
    }

    public void writeInFile(String s) {
        try {
            file.createNewFile(); // Create the file if it doesn't exist
            try (FileWriter writer = new FileWriter(file, true)) { // Use try-with-resources
                writer.write(s + System.lineSeparator());
            }
        } catch (IOException ioe) {
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

            while ((temp = bfr.readLine()) != null) {
                text.append(temp).append(System.lineSeparator());
            }

            System.out.println(text.toString());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
