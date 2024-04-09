import java.util.Scanner;

public class task6 {
    public static void reverse(int n){
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        if(n != 1){
            reverse(n - 1);
        }
        System.out.println(x);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        reverse(n);
    }
}
