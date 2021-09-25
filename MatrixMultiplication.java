package ArrayPractice;

public class MatrixMultiplication {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave \n Date: 6th July 2021\n\n");
		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matrix2[][] = { { 1, 9, 5 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int matrix3[][] = new int[matrix1.length][matrix2.length];
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3.length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
				}
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
