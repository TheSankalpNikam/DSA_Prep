package ExtraQuestions;

import java.math.BigInteger;

public class LargeFactorial {
    // Difference between this and normal factorial is it's constraints
    // 1 <= num <= 100
    // 100! cannot be stored using any of the data type
    // Hence we are using BigInteger

    public static String largeFactorial(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.ONE + "";
        }
        BigInteger answer = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println("Factorial of " + num + " is: " + largeFactorial(num));
    }
}
