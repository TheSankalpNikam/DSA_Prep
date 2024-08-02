package RecursionQuestion;

//9. Palindrome Number - (LeetCode)
public class PalindromeNumber {
    public static boolean helper(String str, int i, int n) {
        if (i >= n / 2)
            return true;
        if (str.charAt(i) != str.charAt(n - i - 1))
            return false;
        return helper(str, i + 1, n);
    }

    public static boolean isPalindrome(int num) {
        if (num < 0)
            return false;
        String str = num + "";
        return helper(str, 0, str.length());
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        System.out.println(num1 + " is palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is palindrome: " + isPalindrome(num2));
    }
}
