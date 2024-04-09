import java.util.Scanner;

public class task1 {
    public static int sumSquares(int n){
        if(n == 1){
            return 1;
        }
        return (n * n) + sumSquares(n - 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(sumSquares(n));
    }
}
