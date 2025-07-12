package vvce;
import java.util.*;

public class OneZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noZero();
	}
	public static void noZero() {
		int n, flag=0, count=0, ans=0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if(n == -1)
				break;
			if(n == 1) 
				flag =1;
			if(flag == 1 && n==0) 
				count++;
			if(n == 1 && flag == 1) 
				ans += count;

		}
		System.out.println(ans);
	}

}
