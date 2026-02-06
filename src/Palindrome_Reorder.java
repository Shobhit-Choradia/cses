import java.util.HashMap;
import java.util.Scanner;

public class Palindrome_Reorder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        int oddCount = 0;

        for (char c : map.keySet()) {
            int freq = map.get(c);

            if (freq % 2 == 1) {
                oddCount++;
                middle = String.valueOf(c);
            }

            left.append(String.valueOf(c).repeat(Math.max(0, freq / 2)));
        }

        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        String start = String.valueOf(left);
        String right = left.reverse().toString();

        System.out.println(start + middle + right);
    }
}
