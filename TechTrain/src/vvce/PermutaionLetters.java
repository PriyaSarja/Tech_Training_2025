package vvce;

public class PermutaionLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = "onion";
		Repeat(w);
	}
	public static void Repeat(String word) {
        int[] a = new int[256];
        char[] f = word.toCharArray();
        
        for(int i = 0 ; i<f.length; i++) 
        	a[f[i]]++;
        
        int num = Factorial(f.length); 
        int den=1;
        
        for(int i = 97; i <= 122; i++) {
        	if(a[i] > 1) {
        		den = den*Factorial(a[i]);
        	}
        }
        System.out.println(num / den);	
	}
	public static int Factorial(int n) {
		if(n == 1 || n == 0) 
			return 1;
		else
			return (n*Factorial(n-1));
	}
}
