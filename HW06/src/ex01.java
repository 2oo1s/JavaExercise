class Matrix {
	public void addMatrix(int[][] x, int[][] y, int[][] z) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
	}

	public void printMatrix(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++)
				System.out.print(n[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}

public class ex01 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		int[][] c = new int[2][3];

		Matrix mx = new Matrix();
		System.out.println("행렬 a");
		mx.printMatrix(a);
		System.out.println("행렬 b");
		mx.printMatrix(b);
		System.out.println("행렬 c");
		mx.addMatrix(a, b, c);
		mx.printMatrix(c);
	}

}
