import java.util.Scanner;

public class Two_Sets{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();

        long total = n*(n+1)/2;
        if (total % 2 != 0){
            System.out.println("NO");
            System.exit(0);
        }

        System.out.println("YES");
        long part = total / 2;

        StringBuilder group1 = new StringBuilder();
        StringBuilder group2 = new StringBuilder();
        int count1 = 0;
        int count2 = 0;

        for (long i = n; i > 0; i--) {
            if (part >= i) {
                part -= i;
                group1.append(i).append(" ");
                count1++;
            } else {
                group2.append(i).append(" ");
                count2++;
            }
        }

        System.out.println(count1);
        System.out.println(group1);
        System.out.println(count2);
        System.out.println(group2);


    }
}