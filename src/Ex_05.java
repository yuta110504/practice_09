import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		int n, k;
		System.out.print("Nhap n : ");
		n = imp.nextInt();
		System.out.print("Nhap k :");
		k = imp.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]= ");
			arr[i] = imp.nextLong();
		}System.out.println("Phan tu co gia tri k = ");
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] == k) 
			System.out.print(+arr[i]);
		
		}
	}
}
