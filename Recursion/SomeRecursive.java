import java.util.Arrays;
import java.util.function.Function;

/**
 * Write a recursive function called someRecursive which accepts an array and a callback.
 * The function returns true if a single value in the array returns true when passed to the callback. 
 * Otherwise, it returns false
 * Examples:
 * someRecursive({1, 2, 3, 4}, isOdd) => true
 * someRecursive({4, 6, 8, 9}, isOdd) => true
 * someRecursive({4, 6, 8}, isOdd) => false
 */

class OddFunction {
  boolean run(int num) {
      if (num % 2 == 0) { 
          return false; }
     else {
         return true;
     }
  }
}

public class SomeRecursive {
  static boolean someRecursive(int[] arr, OddFunction odd) {
    if (arr.length == 0)
      return false;

    if (odd.run(arr[0])) {
      return true;
    }

    int[] subArr = Arrays.copyOfRange(arr, 1, arr.length);
    return someRecursive(subArr, odd);
  }

  public static void main(String[] args) {
    int[] myArr = {4, 6, 8, 9};

    System.out.println(someRecursive(myArr, new OddFunction()));
  }
}

