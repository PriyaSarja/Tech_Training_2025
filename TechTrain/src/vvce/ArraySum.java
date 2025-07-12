package vvce;
import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        //int[] a = {0, 9, 9, 9};
    	//int[] a = {0, 1, 2, 3};
    	int[] a = {0, 9, 8, 9};
        int carry = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + carry;
            a[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] newA = new int[a.length + 1];
            newA[0] = carry;
            System.arraycopy(a, 0, newA, 1, a.length);
            a = newA;
        }
        System.out.println(Arrays.toString(a));
        //for(int i = 0; i < a.length; i++)
          //System.out.print(a[i]+" ");
    }

}
