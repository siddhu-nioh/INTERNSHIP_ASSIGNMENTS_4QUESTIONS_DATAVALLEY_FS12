// 2) write a java program to count the number of vowels and consonants in a given string .
public class VowelConsonantCounter {

    public static void main(String[] args) {
      String str = "This is a test string";
      int vowelCount = 0;
      int consonantCount = 0;
  
      str = str.toLowerCase(); // Converting to lower case for beterr understnding of case sensitive 
  
      for (char c : str.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowelCount++;
          } else {
            consonantCount++;
          }
        }
      }
  
      System.out.println("The string '" + str + "' has " + vowelCount + " vowels and " + consonantCount + " consonants.");
    }
  }
  
