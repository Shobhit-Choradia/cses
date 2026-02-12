import java.util.Arrays;
import java.util.Scanner;

public class Ferris_Wheel {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.nextLine();

        String[] str = sc.nextLine().split(" ");
        int len = str.length;
        long[] nums = new long[len];

        for (int i = 0; i < len; i++) {
            nums[i] = Long.parseLong(str[i]);
        }

        Arrays.sort(nums);

        int count = 0;
        int i = 0;
        int j = len-1;

        while( i <= j){
            if (nums[i] + nums[j] <= k){
                count++;
                i++;
                j--;
            } else {
                j--;
                count++;
            }
        }

        System.out.println(count);
    }
}