package vvce;
import java.util.Scanner;

public class Palindrome {

    public static int revNum(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static int mirror(int n) {
        while (n != revNum(n)) {
            int r = revNum(n);
            n = n + r;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = mirror(n);
        System.out.println(result);
        sc.close();
    }
}

