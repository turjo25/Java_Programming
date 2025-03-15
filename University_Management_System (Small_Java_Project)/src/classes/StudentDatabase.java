package classes;

import java.util.ArrayList;
import java.util.Scanner;
import fileio.*;
import interfaces.*;

public class StudentDatabase implements StudentManagement {
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> sids = new ArrayList<>();
    private ArrayList<String> departments = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);
    private StudentReadWrite srw = new StudentReadWrite();

    public void add(int count) {
        for (int i = 0; i < count; i++) {
            try {
                System.out.println("Enter Student Name: ");
                String name = scanner.next();

                System.out.println("Enter Student ID: ");
                int sid = scanner.nextInt();

                System.out.println("Enter Student Department: ");
                String department = scanner.next();

                names.add(name);
                sids.add(sid);
                departments.add(department);

                // Write to file
                srw.writeInFile("NAME: " + name + "\nSTUDENT ID: " + sid + "\nDEPARTMENT: " + department);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear the buffer
            }
        }
        showInfo();
    }

    public void search() {
        System.out.println("Enter Student ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < sids.size(); i++) {
            if (sids.get(i) == searchId) {
                System.out.println("--- STUDENT DETAILS ---");
                System.out.println("NAME: " + names.get(i));
                System.out.println("STUDENT ID: " + sids.get(i));
                System.out.println("DEPARTMENT: " + departments.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found.");
        }
    }

    public void delete() {
        System.out.println("Enter Student ID to delete: ");
        int deleteId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < sids.size(); i++) {
            if (sids.get(i) == deleteId) {
                names.remove(i);
                sids.remove(i);
                departments.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("Student ID not found.");
        }

        showInfo();
    }

    public void update() {
        System.out.println("Enter Student ID to update: ");
        int updateId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < sids.size(); i++) {
            if (sids.get(i) == updateId) {
                System.out.println("Enter new name: ");
                String newName = scanner.next();

                System.out.println("Enter new ID: ");
                int newSid = scanner.nextInt();

                System.out.println("Enter new department: ");
                String newDepartment = scanner.next();

                names.set(i, newName);
                sids.set(i, newSid);
                departments.set(i, newDepartment);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student record updated successfully.");
        } else {
            System.out.println("Student ID not found.");
        }

        showInfo();
    }

    public void showInfo() {
        System.out.println("--- STUDENT DETAILS ---");
        System.out.println("NAME        STUDENT ID        DEPARTMENT");

        for (int i = 0; i < names.size(); i++) {
            System.out.printf(names.get(i)+"   "+sids.get(i)+"  "+departments.get(i));
        }
    }

    public void loadDataFromFile() {
        System.out.println("Reading data from file...");
        srw.readFromFile();
    }
}
