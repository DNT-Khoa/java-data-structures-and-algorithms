/**
 * Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function
 * Examples:
 * recursiveRange(6) // 21
 * recursiveRange(10) // 55
 */

public class RecursiveRange {
  static int recursiveRange(int num) {
    if (num <= 0) {
      return 0;
    }

    return num + recursiveRange(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(recursiveRange(10));
  }
}
