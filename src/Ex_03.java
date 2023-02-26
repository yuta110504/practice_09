import java.util.Scanner;

public class Ex_03 {
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	System.out.print("Nhap n do dai mang : ");
	int n = imp.nextInt();
	long arr [] = new long[n];
	System.out.print("Nhap tung phan tu cho mang :");
	for (int i = 0; i < n ; i++) {
		System.out.print("a["+i+"]= ");
		arr[i] = imp.nextLong();
		}System.out.print("Tong phan tu dau tien va cuoi cung cua mang = " + (arr[0] + arr[n -1]));
	}
}

