import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Coin_Piles {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            long left = Long.parseLong(st.nextToken());
            long right = Long.parseLong(st.nextToken());

            if ((left + right) % 3 == 0 && (Math.max(left, right) <= 2 * (Math.min(left, right)))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}