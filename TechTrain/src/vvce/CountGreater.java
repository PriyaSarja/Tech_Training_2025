package vvce;

public class CountGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {7, 4, 8, 2, 9};
		System.out.println(greater(arr1));  

		int[] arr2 = {3, 4, 5, 8, 9};
		System.out.println(greater(arr2)); 
	}
	public static int greater(int[] arr) {
		int count = 1, cur_max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > cur_max) {
				count += 1;
				cur_max = arr[i];
			}
		}
		return count;
	}

}
