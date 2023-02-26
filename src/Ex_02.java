import java.util.Iterator;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		// Nhap do dai mang
		System.out.println("Nhap n :");
		int n = imp.nextInt();
		long arr[] = new long[n];
		// Duyet va Nhap tung phan tu cua mang 
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			arr[i] = imp.nextLong();
		}
		//in tung phan tu cua mang
		System.out.print("ARR = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + " ");
		}

	}
}
