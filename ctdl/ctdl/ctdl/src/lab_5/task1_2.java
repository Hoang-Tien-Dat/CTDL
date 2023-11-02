package lab_5;

public class task1_2 {
	public static int[][] subtract(int[][] a, int[][] b) {
	    int rows = a.length;
	    int columns = a[0].length;
	    int[][] result = new int[rows][columns];

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {
	            result[i][j] = a[i][j] - b[i][j];
	        }
	    }

	    return result;
	}

}
