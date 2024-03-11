package EXCEPTIONHANDLING_DIVISION;

public class DivisionException {

    public static void divideNumbers(int numerator, int denominator) {
      if (denominator == 0) {
        throw new ArithmeticException("Division by zero is not allowed!");
      } else {
        double result = (double) numerator / denominator; // Cast to double for floating-point division
        System.out.println("Result: " + result);
      }
    }
  
    public static void main(String[] args) {
      int num = 10;
      int den = 0;
  
      try {
        divideNumbers(num, den);
      } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
      } finally {
        // Optional: Code to be executed always (e.g., closing resources)
      }
    }
  }
  