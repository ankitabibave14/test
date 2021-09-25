package ArrayPractice;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave \n Date: 6th July 2021\n\n");

		int a[] = { 18, 5, 7, 37, 78, 99, 51, 45 };
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			// Swap with min element
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
