package vvce;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    /*double num = 2.3;
		    int div = (int)num;
		    System.out.println(div);
		    int frac = (int)((num - div) * 60);
		    System.out.println(frac);
		    System.out.println("Time = "+ div + ":"+ frac);*/
		double time = 2.3;
		int count =0 ;
		while(time>=1) {
			time--;
			count++;}
		System.out.println(count+ ":" +time*60);
	}
}
