package vvce;

public class Space {

	public static void main(String[] args) {
		String str = "Hello world ";
		int len= 0;
		int count = 0;
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ' && count == 0) {
                continue;
                }
            else if (str.charAt(i) == ' ' && count > 0) {
                break;
            }
            else {
                count++;
            }
		}
		System.out.println("Length of string without space: " + count);
	}
}
/*for (int i = 0; i < str.toCharArray().length; i++) 
len++;
System.out.println("Length of string: " + len);*/

        

