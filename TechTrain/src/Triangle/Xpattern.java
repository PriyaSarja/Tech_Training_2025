package Triangle;

public class Xpattern {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j == i || j == (2 * n - i))
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j == i || j == (2 * n - i))
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
