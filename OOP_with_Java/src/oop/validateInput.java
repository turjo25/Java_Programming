package oop;

// Example.java
public class validateInput {
    public static void main(String[] args) {
        try {
            validateInput(5);
            validateInput(-1); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: "+e.getMessage());
        }
    }

    public static void validateInput(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Input must be non-negative");
        }else {
            System.out.println("Valid Input");
        }
        // Business logic for valid input
    }}
