package Task1;
// 1)
public class Matrix {
	public static int[][] add(int[][] a, int[][] b) {
		int row = a.length;
		int col = a[0].length;
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = a[i][j]+b[i][j];
			}
		}

		return result;

	}
// 2)
	public static int[][] subtract(int[][] a, int[][] b) {
		int row = a.length;
		int col = a[0].length;
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}

		return result;
	}
// 3)
	public static int[][] multiply(int[][] a, int[][] b) {
		int row = a.length;
		int col = b[0].length;
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int sum = 0;
				for (int k = 0; k < b.length; k++) {
					sum += a[i][j] * b[i][j];
				}
				result[i][j] = sum;
			}
		}

		return result;
	}
// 4)
	public static int[][] transpose(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = a[i][j];
			}
		}

		return result;

	}

}
