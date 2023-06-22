package RevisionInterviewbit;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = (n * (n + 1)) / 2;
        
        for (int i = 1; i < n; i++) {
            sum -= sc.nextInt();
        }
        System.out.println(sum);
    }
}
