package arrayProgram;

public class DescendingWithoutSort {

	public static void main(String[] args) {

		int Array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < Array.length; i++) {
			int temp = 0;

			for (int j = i + 1; j < Array.length; j++) {

				if (Array[i] < Array[j]) {

					temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
			}
		}
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

	}
}
