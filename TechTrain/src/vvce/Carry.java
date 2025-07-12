package vvce;

import java.util.Scanner;

public class Carry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		carryCount(a,b);
	}
	public static void carryCount(int n1, int n2) {
		int last1, last2, sum ,carryValue = 0, flag=0, count =0;
		while(n1 != 0 || n2 != 0) {
			last1 = n1%10;
			last2 = n2%10;
			sum = last1 + last2 + flag;
			if(sum>9) {
				count++;
				flag=1;
			}
			else 
				flag = 0;
				n1/=10;
				n2/=10;
		}
		System.out.println(count);
		
	}
}
