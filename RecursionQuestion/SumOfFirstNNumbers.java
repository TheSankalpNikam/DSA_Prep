package RecursionQuestion;

public class SumOfFirstNNumbers {

    public static int sumOfFirstNNumbers(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumOfFirstNNumbers(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(3));

    }
}
