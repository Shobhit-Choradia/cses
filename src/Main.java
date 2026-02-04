import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String dna = sc.nextLine();
        int repetition = 1;
        int max = 0;
        char prev = dna.charAt(0);

        for (int i = 1; i < dna.length(); i++){

            if (dna.charAt(i) == prev) repetition++;
            else {
                prev = dna.charAt(i);
                max = Math.max(max, repetition);
                repetition = 1;
            }

        }
        max = Math.max(max, repetition);
        System.out.println(max);
    }
}