import java.util.*;
import java.io.*;

public class Sum_Of_Two_Values {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long sum = Long.parseLong(st.nextToken());

        HashMap<Long, Long> set = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (long i = 1; i <= n; i++) {
            long number = Long.parseLong(st.nextToken());
            if (set.containsKey(sum - number)) {
                System.out.println(i + " " + set.get(sum - number));
                return;
            }
            set.put(number, i);
        }
        System.out.println("IMPOSSIBLE");
    }
}