package Triangle;

public class TriNum{

    public static void main(String[] args) {
        int rows = 5; 
        int[][] arr = new int[rows][];  
        arr[0] = new int[1];  
        arr[0][0] = 1;  
        for (int i = 1; i < rows; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i - 1][i - 1]; 
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}




