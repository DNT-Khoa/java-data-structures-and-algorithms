/**
 * Write a function called "productOfArray" which takes in an array of numbers and returns the product of them all
 * Examples:
 * int arr[] = {1, 2, 3, 4, 5}
 * productOfArray(arr, arr.length) => 120
 */

public class ProductOfArray {
  static int productofarray(int A[], int N) {
    if (N <= 0) {
      return 1;
    }

    return A[N - 1] * productofarray(A, N - 1);
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(productofarray(arr, arr.length));
  }
}
