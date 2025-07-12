package vvce;

public class RomanNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int num = 13;
		for(int i = 0; i<num ; i++) {
			while(num>=values[i]) {
				System.out.println(symbols[i]);
				num = num - values[i];
			}
		}
	}
}
