package practice_program;

/*
 * input : 8, 9, 10, 2, 5, 6, 7
 * output : array is rotated 3 times
 * 
 */
public class FindEleInCircularRotatedArray {
	public static boolean myRecursiveSearch(int arr[], int element, int low, int high) {
		if (high < low)
			return false;
		int midIndex = (low + high) / 2;
		if (element == arr[midIndex]) {
			return true;
		} else if (element < arr[midIndex]) {
			return myRecursiveSearch(arr, element, low, midIndex - 1);
		} else {
			return myRecursiveSearch(arr, element, midIndex + 1, high);
		}
	}

	public static int findNoOfRotationInCircularSortedRotatedArray(int arr[], int low, int high) {
		if (high < low)
			return -1;

		int midIndex = (low + high) / 2;
		int midEle = arr[midIndex];
		if (arr[midIndex - 1] > midEle) {
			return midIndex;
		} else if (arr[midIndex - 1] < midEle) {
			return findNoOfRotationInCircularSortedRotatedArray(arr, low, midIndex - 1);
		} else {
			return findNoOfRotationInCircularSortedRotatedArray(arr, midIndex + 1, high);
		}
	}

	static int countRotations(int arr[], int low, int high) {
		if (high < low)
			return 0;
		if (high == low)
			return low;
		//int mid = low + (high - low) / 2;
		int mid = (low + high)/2;
		if (mid < high && arr[mid + 1] < arr[mid]) 
			return (mid + 1);
		if (mid > low && arr[mid] < arr[mid - 1])
			return mid;
		if (arr[high] > arr[mid])
			return countRotations(arr, low, mid - 1);

		return countRotations(arr, mid + 1, high);
	}
	public static void countRotation(int arr[]) {
		int count = 0;
		int i;
		for(i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i] && arr[i]<arr[i+1]) {
				count = i;
				break;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {

		int arr[] = {8, 9, 10,11,12, 5, 6};
		int len = countRotations(arr, 0, arr.length - 1);
		System.out.println(len);
	}

}
