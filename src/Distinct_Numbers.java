import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        sc.nextLine();

        Set<String> nums = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));

        System.out.println(nums.size());
    }
}