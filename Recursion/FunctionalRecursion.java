package Recursion;

public class FunctionalRecursion {

    public static void swapInArray(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void printAnArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void reverseAnArray(int[] A, int i, int n) {
        if (i >= n / 2)
            return;
        swapInArray(A, i, n - i - 1);
        reverseAnArray(A, i + 1, n);
    }

    public static boolean isPalindrome(String str, int i) {
        if (i >= str.length() / 2)
            return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return isPalindrome(str, i + 1);
    }

    public static void main(String[] args) {
        // int[] num1 = { 1, 2, 3, 4, 5 };
        // int[] num2 = { 1, 2, 3, 4, 5, 6 };
        // reverseAnArray(num1, 0, num1.length);
        // reverseAnArray(num2, 0, num2.length);
        // printAnArray(num1);
        // System.out.println();
        // printAnArray(num2);
        String str = "racedcar";
        System.out.println(str + " is a palindrome: " + isPalindrome(str, 0));
    }
}
