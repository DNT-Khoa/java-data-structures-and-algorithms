/**
 * Write a recursive function called reverse which accepts a string and returns a new string in reverse
 * Examples: 
 * reverse('java') => 'avaj'
 * reverse('appmillers') => 'srellimppa'
 */

public class Reverse {
  static String reverse(String str) {
    int length = str.length();

    if (length == 0) {
      return "";
    }

    return str.substring(length - 1) + reverse(str.substring(0, length - 1));
  }

  public static void main(String[] args) {
    System.out.println(reverse("appmillers"));
  }
}
