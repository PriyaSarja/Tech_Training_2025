package vvce;

public class Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] testValues = {1, 26, 27, 28, 52, 703, 702};
	        for (int value : testValues) {
	            System.out.println(value + " -> " + toColumn(value));
	        }
	}
	public static String toColumn(int n) {
		  StringBuilder result = new StringBuilder();
		        while (n > 0) {
		            n--; 
		            result.insert(0, (char) (n % 26 + 'A')); 
		            n /= 26; 
		        }
		        return result.toString();
		    }
	/* rem = (n-1)%26;
	   temp[i] = 'A' + rem;
	   i++;
	   n = (n-1)/26*?
	 */

}
