public class task10 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 != 0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }
    public static void printPowersOfTwo(int start, int end) {
        if (start <= end) {
            if (isPowerOfTwo(start)) {
                System.out.println(start + " is a power of two");
            } else {
                System.out.println(start + " is not a power of two");
            }
            printPowersOfTwo(start + 1, end);
        }
    }

    public static void main(String[] args) {
        printPowersOfTwo(0, 32);
    }


}