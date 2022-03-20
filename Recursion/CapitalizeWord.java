/**
 * Implement a function that capitalizes each word in String
 * Example: 
 * input: i love java
 * output: I Love Java
 */

public class CapitalizeWord {
  static String capitalizeWord(String str) {
    char lastChar = str.charAt(str.length() - 1);
    
    if (str.length() == 1) {
      return Character.toString(Character.toUpperCase(str.charAt(0)));
    }

    if (Character.isWhitespace(str.charAt(str.length() - 2))) {
      lastChar = Character.toUpperCase(lastChar);
    }

    return capitalizeWord(str.substring(0, str.length() - 1)) + lastChar;
  }
  
  public static void main(String[] args) {
    String myStr = "i love java";

    System.out.println(capitalizeWord(myStr));
  }
}
