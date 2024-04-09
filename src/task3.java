import java.util.Scanner;

public class task3 {
    public static int firstNint(int n){
        if (n == 1){
            return 1;
        }
        return n + firstNint(n - 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(firstNint(n));
    }
}
