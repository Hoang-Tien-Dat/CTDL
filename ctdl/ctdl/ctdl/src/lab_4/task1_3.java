package lab_4;

public class task1_3 {
	public static void insertionSort(int[] array) {
	    int n = array.length;
	    for (int i = 1; i < n; i++) {
	        int key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] < key) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}
        int[]array = {5, 3, 9, 1, 7}; 
        void insertionsoft(array);
        System.out.println(Array.toString(array));
} 
}