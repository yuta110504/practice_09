import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		int songuyen[] = new int[10];
		System.out.print("Nhap 10 so nguyen: ");
		for (int i = 0; i < songuyen.length; i++) {
			songuyen[i] = imp.nextInt();
		}
		System.out.print("10 so nguyen vua nhap la: ");
		for (int i = 0; i < songuyen.length; i++)
			System.out.print(songuyen[i] + " ");

	}
}
