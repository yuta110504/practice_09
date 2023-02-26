import java.util.Scanner;

public class Ex_06 {
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	System.out.println("Nhap n : ");
	int tong = 0 ;
	int n = imp.nextInt();
	long arr[] = new long [n];
	for (int i = 0; i < n; i++) {
	System.out.print("a["+i+"] = ");
		arr[i] = imp.nextLong();	
	}
	System.out.print("Tong cac so lon hon 0 = ");
	for (int i = 0; i < arr.length; i++) {
		if( arr[i] % 2 > 0  ) {
			tong += arr[i];
		}
	}System.out.print(tong);
}
}
