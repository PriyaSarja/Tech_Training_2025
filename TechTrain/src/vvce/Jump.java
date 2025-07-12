package vvce;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,4,8,5};
		//int[] arr = {0,3,5,7,4,8,5};
		//int[] arr = {1,3,5,7,0,8,5};
		int len = arr.length;
		jumpGame(arr,len);
	
	}
	public static void jumpGame(int arr[], int len) {
		int step = arr[0];
		int jumps = 1;
		int maxReach = arr[0];
		for(int i = 1; i < len; i++) {
			step--;
			if(i+arr[i] > maxReach) {
				maxReach = i + arr[i];
			}
			if(step == 0) {
				jumps++;
				step = maxReach - i;
			}
		}
		System.out.println(jumps);
	}
}
