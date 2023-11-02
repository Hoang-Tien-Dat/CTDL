package lab_4;

public class task1 {
	public static void selectionSort(int[] array) {
	    int n = array.length;
	    for (int i = 0; i < n - 1; i++) {
	        int maxIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (array[j] > array[maxIndex]) {
	                maxIndex = j;
	            }
	        }
	        int temp = array[maxIndex];
	        array[maxIndex] = array[i];
	        array[i] = temp;
	    }
	}
}
