import java.util.Scanner;

public class Main {
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

        long winsum = 0;
        for(int i = 0; i < k; i++){
            winsum += arr[i];
        }

        long xor = winsum;
        for(int i = k ; i < n; i++){
            winsum += arr[i] - arr[i-k];
            xor = xor ^ winsum;
        }

        System.out.println(xor);
    }
}
