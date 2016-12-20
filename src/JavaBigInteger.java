/**
 * https://www.hackerrank.com/challenges/java-biginteger
 *
 * Created by dinuk on 12/20/2016.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();

        BigInteger sum = new BigInteger(number1).add(new BigInteger(number2));
        BigInteger product = new BigInteger(number1).multiply(new BigInteger(number2));


        System.out.println(sum);
        System.out.println(product);
    }
}
