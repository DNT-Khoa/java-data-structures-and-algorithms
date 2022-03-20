/**
 * Given a string find its first uppercase letter
 * Example: 
 * Input: appmillersS
 * Output: S
 */

public class FirstUppercase {
  static char first(String str) {
    if (str.length() == 0) {
      return Character.MIN_VALUE;
    }

    if (Character.isUpperCase(str.charAt(0))) {
      return str.charAt(0);
    }

    return first(str.substring(1));
  }
  public static void main(String[] args) {
    String s = "appmillersS";
    System.out.println(first(s));
  }
}
