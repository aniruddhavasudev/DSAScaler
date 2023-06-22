package RevisionInterviewbit;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int maxVal = Math.max(x, y);
            long cornerVal = (long) maxVal * maxVal - maxVal + 1;
            long squareSize = 2 * maxVal - 1;
            if (x == y) {
                System.out.println(cornerVal);
            } else if (x < y) {
                long val = cornerVal - (squareSize - 1) + x;
                System.out.println(val);
            } else {
                long val = cornerVal + (squareSize - 1) - y;
                System.out.println(val);
            }
        }
    }
}
