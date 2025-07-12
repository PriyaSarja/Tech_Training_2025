package vvce;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String cd = "aabbbccaa"; 
        char[] c = cd.toCharArray();

        int count = 1;
        char cur = c[0];

        for (int i = 1; i < c.length; i++) { 
            if (c[i] == cur) {
                count++;
            } else {
                System.out.println(cur + ":" + count);
                cur = c[i];
                count = 1;
            }
        }
        System.out.println(cur + ":" + count);
    }
}
