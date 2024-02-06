import java.util.*;

public class binary_to_decimal {

    public static void BinToDec(int n) {
        int myNum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("decimal of " + myNum + " is " + dec);
    }

    public static void main(String[] args) {

        BinToDec(111);
    }
}
