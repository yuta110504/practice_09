import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int tong = 0;
		int n = imp.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a [" + i + "] = ");
			arr[i] = imp.nextLong();
		}
		System.out.print("ARR >=0 & <=10 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] <= 10) {
				tong += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Tong cac so le >= 0 & <= 10 la : ");
		System.out.print(tong);
	}
}
