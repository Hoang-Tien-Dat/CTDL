package task_1;

public class task1_1 {
	public class MyArray {
	    private int[] array;

	    public MyArray(int[] array) {
	        this.array = array;
	    }

	    public int iterativeLinearSearch(int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public int recursiveLinearSearch(int target) {
	        return recursiveLinearSearchHelper(target, 0);
	    }

	    private int recursiveLinearSearchHelper(int target, int index) {
	        if (index >= array.length) {
	            return -1;
	        }
	        if (array[index] == target) {
	            return index;
	        }
	        return recursiveLinearSearchHelper(target, index + 1);
	    }
	}
}
