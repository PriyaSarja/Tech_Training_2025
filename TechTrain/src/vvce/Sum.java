package vvce;

public class Sum {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n = 12345;
	if(n<100) {
	}
	else if(n<1000){
		System.out.print(n%10);
	}
	else {
		while(n>9999){
			n = n/10;
			}
	System.out.println((n%10)+(n/10%10));
	}
  }
}
	/*
		int a = revNum(12345);
		int b = (a/100)%10;
		int c = (a/1000)%10;
		System.out.println("Sum:"+(b+c));
	}
	public static int revNum(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}*/






