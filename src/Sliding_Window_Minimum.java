import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Sliding_Window_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long[] arr = new long[n];
        arr[0] = x;
        for (int i = 1; i < n; i++) {
            arr[i] = (a * arr[i - 1] + b) % c;
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        long xor = arr[dq.peekFirst()];

        for (int i = k; i < n; i++) {

            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            xor ^= arr[dq.peekFirst()];
        }

        System.out.println(xor);
    }
}
