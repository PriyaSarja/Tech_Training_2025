package vvce;

public class Celebrity {
static int N =4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] M = {
	            {0, 1, 0, 1},
	            {0, 0, 0, 0},
	            {0, 1, 0, 0},
	            {0, 1, 0, 0}
	        };
		int celeb = findCeleb(M);
		if(celeb == -1) {
			System.out.println("NO celebrity");
		}
		else {
			System.out.println("Celebrity at: "+(celeb+1));
		}

	}
	public static int isCeleb(int M[][], int cand) {
		for(int i = 0 ; i < N; i++) {
			if(i != cand) {
				if(M[cand][i] == 1 || M[i][cand] == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
	public static int findCeleb(int M[][]) {
		for(int i = 0; i<N; i++) {
			if(isCeleb(M,i)==1) {
				return i;	
			}
		}
		return -1;
	}
}
