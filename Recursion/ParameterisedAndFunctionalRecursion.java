package Recursion;

public class ParameterisedAndFunctionalRecursion {
    // Parameterized Way - (passing values via parameters)
    public static void printTheSumOfFirstNNumbers(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        printTheSumOfFirstNNumbers(i - 1, sum + i);
    }

    // Functional Way - (Letting function go his job) Breaking problem into smaller
    // subproblems
    public static int printTheSumofNNumbersFunctional(int num) {
        if (num == 0)
            return 0;
        return num + printTheSumofNNumbersFunctional(num - 1);
    }

    public static void main(String[] args) {
        int num = 3;
        // printTheSumOfFirstNNumbers(num, 0);
        System.out.println(printTheSumofNNumbersFunctional(num));
    }
}
