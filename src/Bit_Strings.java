import java.math.BigInteger;
import java.util.Scanner;

public class Bit_Strings{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String n = sc.nextLine();

        BigInteger num = new BigInteger(String.valueOf(n));
        BigInteger base = BigInteger.valueOf(2);
        BigInteger modulus = BigInteger.valueOf(1000000007);

        BigInteger ans = base.modPow(num, modulus);

        System.out.println(ans);

    }
}