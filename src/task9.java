import java.util.Scanner;

public class task9 {
    public static void allPermutations(char[] n, int index) {
        if (index == n.length - 1) {
            System.out.println(String.valueOf(n));
            return;
        }
        for (int i = index; i < n.length; i++) {
            swap(n, index, i);
            allPermutations(n, index + 1);
            swap(n, index, i);
        }
    }

    public static void swap(char[] n, int i, int j) {
        char temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        allPermutations(input.toCharArray(), 0);
    }
}
