package task_1;

public class task1_2 {
	public class MyArray {
	    private int[] array;

	    public MyArray(int[] array) {
	        this.array = array;
	    }

	    public int iterativeBinarySearch(int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid;
	            }

	            if (array[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1;
	    }

	    public int recursiveBinarySearch(int target) {
	        return recursiveBinarySearchHelper(target, 0, array.length - 1);
	    }

	    private int recursiveBinarySearchHelper(int target, int left, int right) {
	        if (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid;
	            }

	            if (array[mid] < target) {
	                return recursiveBinarySearchHelper(target, mid + 1, right);
	            } else {
	                return recursiveBinarySearchHelper(target, left, mid - 1);
	            }
	        }

	        return -1;
	    }
	}

}
