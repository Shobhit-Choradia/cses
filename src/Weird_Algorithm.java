import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Weird_Algorithm {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        // PrintWriter is much faster than System.out.print
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int num = fr.nextInt();
        out.print(num + " ");

        long n = num;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            out.print(n + " ");
        }

        // Always close or flush the PrintWriter to ensure output is actually shown
        out.flush();
        out.close();
    }
}