import java.util.Scanner;

public class task4 {
    public static int sumPow(int b, int n){
        if (n == 0){
            return 1;
        }
        return (int) ((Math.pow(b, n)) + sumPow(b, n - 1));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int b = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(sumPow(b, n));
    }
}
