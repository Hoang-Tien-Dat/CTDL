package lab_5;

public class task1_4 {
	int[][] a = {{1, 2, 3}, {4, 5, 6}};

	int[][] result = transpose(a);

	for (int i = 0; i < result.length; i++) {
	    for (int j = 0; j < result[0].length; j++) {
	        System.out.print(result[i][j] + " ");
	    }
	    System.out.println();
	}
  }
}
