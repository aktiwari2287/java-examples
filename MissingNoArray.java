package practice_program;

public class MissingNoArray {

	private static void printMissingNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int value = Math.abs(array[i]);
			if (array[value - 1] > 0) {
				array[value - 1] = -array[value - 1];
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > 0) {
				System.out.println(i + 1);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 4, 2, 3, 5, 6, 7, 8, 9, 9 };

		printMissingNumbers(input);
	}

}
