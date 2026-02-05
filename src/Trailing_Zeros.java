import java.util.Scanner;

public class Trailing_Zeros{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        long twos = 0;
        long fives = 0;

        long num = n;
        while (num > 0){
            num /= 2;
            twos += num;
        }

        num = n;
        while(num > 0){
            num /= 5;
            fives += num;
        }

        System.out.println(Math.min(twos, fives));
    }
}