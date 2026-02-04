import java.util.Scanner;

public class Increasing_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        long moves = 0;

        long prev = sc.nextLong();

        for (int i = 1; i < n; i++){
            long curr = sc.nextLong();

            if (curr >= prev) prev = curr;
            else moves += prev - curr;
        }

        System.out.println(moves);
    }
}