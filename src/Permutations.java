import java.util.Scanner;

public class Permutations{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n == 1){
            System.out.println(1);
            System.exit(0);
        }

        if (n < 4){
            System.out.println("NO SOLUTION");
            System.exit(0);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i+=2) sb.append(i).append(" ");
        for (int i = 1; i <= n; i+=2) sb.append(i).append(" ");

        System.out.println(sb.toString());
    }
}