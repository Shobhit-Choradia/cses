import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Counting_Divisors {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            int count = 0;
            int root = (int) Math.ceil(Math.sqrt(num));

            for (int j = 1; j < root; j++) if (num % j == 0) count += 2;

            if (root * root == num) count++;

            out.println(count);
        }
        out.close();
    }
}
