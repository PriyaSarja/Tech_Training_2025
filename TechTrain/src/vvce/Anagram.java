package vvce;
import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		if(areAnag(word1,word2)) {
			System.out.println("Anagrams");	
		}
		else {
			System.out.println("Not Anagrams");	
		}
		sc.close();
	}
	public static boolean areAnag(String word1, String word2) {
		if(word1.length() != word2.length()) {
			return false;
		}
		//Letter are diff and length is same using ASCII values
		int[] charCount = new int[256];
		for(int i = 0; i < word1.length(); i++) {
			charCount[word1.charAt(i)]++;
			charCount[word2.charAt(i)]--;	
		}
		for(int c : charCount) {
			if(c != 0) {
				return false;
			}
		}
		return true;
	}
}
