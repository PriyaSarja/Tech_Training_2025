package vvce;

public class NoOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_2 = 0;
		int a=21, b=25; int ans = a;
		for (int n = a; n < b; n++) {
		       int count = 0;
		       int temp = n;
		       while (temp % 2 == 0) {
		           count += 1;
		           temp = temp / 2;
		       }
		       if (count > max_2) {
		           max_2 = count;
		           n = ans;
		       }
		        
		}
		System.out.print(ans);

	}

}

