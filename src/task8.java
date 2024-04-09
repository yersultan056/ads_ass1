import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task8 {
    public static void generateSequences(int n, int k) {
        List<Integer> sequence = new ArrayList<>();
        generate(sequence, n, k);
    }

    public static void generate(List<Integer> sequence, int n, int k) {
        if (sequence.size() == n) {
            printSequence(sequence);
            return;
        }
        for (int i = 1; i <= k; i++) {
            sequence.add(i);
            generate(sequence, n, k);
            sequence.remove(sequence.size() - 1);
        }
    }
    public static void printSequence(List<Integer> sequence) {
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
        generateSequences(n, k);
    }
}
