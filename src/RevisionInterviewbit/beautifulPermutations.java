package RevisionInterviewbit;
import java.util.Scanner;

public class beautifulPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 7;
        
        // If n is 1, then the only permutation is [1]
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        // If n is 2 or 3, then no solution exists
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        
        // Generate the even-indexed numbers in descending order
        for (int i = n - 1; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        
        // Generate the odd-indexed numbers in descending order
        for (int i = n; i >= 1; i -= 2) {
            System.out.print(i +" ");
        }
    }
}
