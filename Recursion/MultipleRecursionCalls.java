package Recursion;

public class MultipleRecursionCalls {
    public static int fibonacci(int i) {
        if (i == 0 || i == 1)
            return i;
        int first = fibonacci(i - 1);
        int second = fibonacci(i - 2);
        return first + second;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}
