import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] inpArr = new int[n][m];
        int[][] outArr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inpArr[i][j] = scanner.nextInt();
            }
        }
        int row = 0;
        for (int i = 0; i < m; i++) {
            int col = n - 1;
            for (int j = 0; j < n; j++) {
                outArr[i][j] = inpArr[col][row];
                col -= 1;
            }
            row += 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(outArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
