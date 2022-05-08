package arrayProgram;

public class MaxMinNumbeWithoutSort {

	public static void main(String[] args) {

		int number[] = { 1, 33, 43, 23, 45, 65, 32, 22, 76, 99, 23 };

		for (int i = 0; i < number.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < number.length; j++) {

				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}

			}
		}

		System.out.println("Maximum number is " + number[number.length - 1]);
		System.out.println("Minimum number is " + number[0]);

	}
}
