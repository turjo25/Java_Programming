package oop;

// CustomException.java
public class CustomException extends Exception {

    // Constructors
    public CustomException() {
        super();
    }
    public CustomException(String message) {
        super(message);
    }
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

