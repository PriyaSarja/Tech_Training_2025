package vvce;

public class ZeroSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,0,15,10,0,2,0,12};
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]== 0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i= 0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
