package EXCEPTION_HANDLING_NEGATIVE_NUMBER;

// Exception handling:
// 1)Create a custom exception class in Java named CustomValidationException. Implement 
// a method that takes an integer as input and throws this custom exception if the number is 
// negative

public class NumberValidator {

    public static class CustomValidationException extends Exception {
      public CustomValidationException(String message) {
        super(message);
      }
    }
  
    public static void validateNumber(int number) throws CustomValidationException {
      if (number < 0) {
        throw new CustomValidationException("Number cannot be negative.");
      } else {
        System.out.println("Number is valid.");
      }
    }
  
    public static void main(String[] args) {
      int number = -5;
      try {
        validateNumber(number);
      } catch (CustomValidationException e) {
        System.out.println("Exception caught: " + e.getMessage());
      }
    }
  }
  