// //
// 1)write a java program to Replace a character at a specific index in a String
// in Java.
// //
public class ReplaceCharacter {

    public static String replaceCharacter(String str, int index, char newChar) {
      if (index < 0 || index >= str.length()) {
        throw new IndexOutOfBoundsException("Index: " + index + ", String length: " + str.length());
      }
      char[] chars = str.toCharArray();
      chars[index] = newChar;
      return new String(chars);
    }
  
    public static void main(String[] args) {
      String str = "Hello, World!";
      char newChar = 'X';
      int index = 7;
  
      String newStr = replaceCharacter(str, index, newChar);
      System.out.println("Original String: " + str);
      System.out.println("New String: " + newStr);
    }
  }
  