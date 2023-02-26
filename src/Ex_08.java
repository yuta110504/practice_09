import java.util.Scanner;
public class Ex_08 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("nhập n : ");
		int sapxep = 0;
		int n = imp.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = imp.nextInt();
		}
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					sapxep = arr[i];
					arr[i] = arr[j];
					arr[j] = sapxep;

				}
			}
		}
		System.out.println("Day da sap xep : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
