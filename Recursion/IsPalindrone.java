import java.util.Objects;

/**
 * Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false
 * Examples:
 * isPalindrome('awesome') => false
 * isPalindrome('foobar') => false
 * isPalindrone('tacocat') => true
 */

public class IsPalindrone {
  static boolean isPalindrome(String s) {
    int length = s.length();

    if (length == 0 || length == 1) {
      return true;
    }

    if (!Objects.equals(s.substring(0, 1), s.substring(length - 1))) {
      return false;
    }

    return isPalindrome(s.substring(1, length - 1));
  }

  public static void main(String[] args) {
    String s = "level";
    System.out.println(isPalindrome(s));
  }
}
