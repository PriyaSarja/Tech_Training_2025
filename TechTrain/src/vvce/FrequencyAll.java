package vvce;

public class FrequencyAll {

    public static void main(String[] args) {
    	String word1 = "aabbbccaa";
    	orderChar(word1);
    	System.out.println();
    	String word2 = "abbaaccc";
    	eachChar(word2);
    	System.out.println();
    	String word3 = "bdbbdacca";
    	onceChar(word3);

    }
    public static void orderChar(String word) {
        char[] c = word.toCharArray();
        int count = 1;
        char cur = c[0];

        for (int i = 1; i < c.length; i++) { 
            if (c[i] == cur) {
                count++;
            } else {
                System.out.print(cur + ":" + count+" ");
                cur = c[i];
                count = 1;
            }
        }
        System.out.println(cur + ":" + count);
    }
    public static void eachChar(String word) {
    	int[] a = new int[256];
        char[] d = word.toCharArray();
        for (int i = 0; i < d.length; i++) {
            a[d[i]]++;
        }

        for (int i = 0; i < 256; i++) {
            if (a[i] > 0) {
                System.out.print((char) i + ": " + a[i]+" ");
            }
        }
    }
    public static void onceChar(String word) {
    	int[] a = new int[256];
        char[] d = word.toCharArray();
        for (int i = 0; i < d.length; i++) {
        	if(a[d[i]] == 0) {
        		System.out.print((char)d[i] + " ");
        		a[d[i]] = 1;
        	}       
        }
    } 
}
