package practice_program;

public class BinarySearch {
	public static int iterativeSearch(int[] arrayToSearch, int element) {
		int lowIndex = 0;
		int highIndex = arrayToSearch.length - 1;

		// Holds the position in array for given element
		// Initial negative integer set to be returned if no match was found on array
		int elementPos = -1;

		// If lowIndex less than highIndex, there's still elements in the array
		while (lowIndex <= highIndex) {
			int midIndex = (lowIndex + highIndex) / 2;
			if (element == arrayToSearch[midIndex]) {
				elementPos = midIndex;
				break;
			} else if (element < arrayToSearch[midIndex]) {
				highIndex = midIndex - 1;
			} else if (element > arrayToSearch[midIndex]) {
				lowIndex = midIndex + 1;
			}
		}
		return elementPos;
	}

	public static boolean binarySearch(int arr[], int first, int last, int key) {
		while (last >= first) {
			int mid = (first + last) / 2;
			if (key == arr[mid]) {
				return true;
			} else if (arr[mid] > key) { // 20 > 50
				last = mid - 1;
			} else {
				first = mid + 1;
			}

		}
		return false;
	}

	public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
		int middle = (low + high) / 2;
		if (high < low) {
			return -1;
		}
		if (key == sortedArray[middle]) {
			return middle;
		} else if (key < sortedArray[middle]) {
			return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
		} else {
			return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
		}
	}

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

	public static void main(String[] args) {

		int arr[] = { 5, 10, 12, 16, 20, 23, 50, 55, 60, 130 };
		 for(int i:arr)
		System.out.println(myRecursiveSearch(arr, i, 0, arr.length - 1));
	}
}
