package Triangle;

public class HG{
	public static void main(String[] args) {
        int n=3, k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((k++)+" ");
            	//System.out.print("* ");
                //System.out.print(i+" ");
            }
            System.out.println();
        }
        k = k-1-1;
        for(int i = 1+1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print((k--)+" ");
                //System.out.print("* ");
            }
            System.out.println();
        }
         
    }
}
