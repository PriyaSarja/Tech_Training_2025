package vvce;

public class LCMandHCFof2 {

    public static void main(String[] args) {
        int a = 12, b = 10;
        System.out.println("The HCF/GCD of " + a + " and " + b + " is: " + GCD(a, b));
        System.out.println("The LCM of " + a + " and " + b + " is: " + LCM(a, b));
   
    }
public static int LCM(int a, int b) {
        return Math.abs(a * b) / GCD(a, b);
    }

    public static int GCD(int x, int y) {
        int rem = x % y;
        if (rem == 0)
            return y;
        else
            return GCD(y, rem);
    }

/*public static int LCMp(int a, int b) {
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; 
            }
            max++;  
        }
	}*/
}

