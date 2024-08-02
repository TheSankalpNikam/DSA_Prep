package Recursion;

class BasicRecursion {
    public static void printFromNTo1(int i, int N) {
        if (i > N)
            return;
        printFromNTo1(i + 1, N);
        System.out.println(i);
    }

    public static void printTillN(int i, int N) {
        if (i > N)
            return;
        System.out.println(i);
        printTillN(i + 1, N);
    }

    public static void printTillNWithBacktrack(int i, int N) {
        if (i < 1) {
            return;
        }
        printTillNWithBacktrack(i - 1, N);
        System.out.println(i);
    }

    public static void printFromNTo1BackTrack(int i, int N) {
        if (i > N) {
            return;
        }
        printFromNTo1BackTrack(i + 1, N);
        System.out.println(i);
    }

    public static void printNTimes(int n) {
        if (n == 0)
            return;
        System.out.println("Shree Swami Samartha");
        printNTimes(n - 1);
    }

    public static void main(String[] args) {
        // printTillN(1, 5);
        // printFromNTo1(1, 5);
        // printTillNWithBacktrack(5, 5);
        // printFromNTo1BackTrack(1, 5);
        // printNTimes(5);
    }
}
