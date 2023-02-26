import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("Nhap n di ku : ");
		int n = imp.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = imp.nextLong();
		}
		System.out.print("So chan la : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
