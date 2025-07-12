package vvce;
import java.util.*;

public class LCMandHCF {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int resultGCD = nums[0];
        int resultLCM = nums[0];

        for (int i = 1; i < n; i++) {
            resultGCD = gcd(resultGCD, nums[i]);
            resultLCM = lcm(resultLCM, nums[i]);
        }

        System.out.println("HCF (GCD) of the numbers: " + resultGCD);
        System.out.println("LCM of the numbers: " + resultLCM);
        sc.close();
    }
}
