import java.util.Scanner;

public class Sliding_Window_XOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long[] arr = new long[n];
        arr[0] = x;
        for (int i = 1; i < n; i++){
            arr[i] = (a*arr[i-1] + b) % c;
        }

        long xor = 0;

        for (int i = 0; i < k; i++){
            xor ^= arr[i];
        }

        long ans = xor;

        for(int i = k; i < n; i++){
            xor ^= arr[i] ^ arr[i-k];
            ans ^= xor;
        }

        System.out.println(ans);
    }
}
