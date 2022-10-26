import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.print("Nhap so phan tu mang: ");
		n = key.nextInt();
		int iarray[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu " + (i +1)+": ");
			int k;
			k = key.nextInt();
			iarray[i] = k;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (iarray[i] < iarray[j]) {
					int c = iarray[i];
					iarray[i] = iarray[j];
					iarray[j] = c;
				}
			}
		}
		int itong = 0;
		System.out.println("Mang sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			System.out.print(iarray[i] +" ");
			itong = itong + iarray[i];
		}
		System.out.print("\n");
		System.out.println("Tong day so la: " + itong + ", Trung binh cong day so la: " + (float)itong/n);
		
		
	}
}
