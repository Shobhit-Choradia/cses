import java.util.Scanner;

public class Apple_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

        System.out.println(solve(0, nums, 0, 0));

        sc.close();
    }

    private static long solve(int i, long[] nums, long s1, long s2) {
        if (i == nums.length) {
            return Math.abs(s1 - s2);
        }

        long d1 = solve(i + 1, nums, s1 + nums[i], s2);
        long d2 = solve(i + 1, nums, s1, s2 + nums[i]);

        return Math.min(d1, d2);
    }
}