import java.util.Scanner;

public class task2 {
    public static int firstNinArr(int n, int[] arr){
        if (n == 1){
            return arr[n - 1];
        }
        return arr[n - 1] + firstNinArr(n - 1, arr);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(firstNinArr(n, arr));
    }
}
