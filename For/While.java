package For;

import java.util.Scanner;

public class While {
	 int min;
	 int max;
	
	public void nhap() {	
	}
	
public static void main(String[] args) {
	int min, max;
	Scanner sc = new Scanner(System.in);
	System.out.println("Min:");
	min = sc.nextInt();
	System.out.println("Max:");
	max = sc.nextInt();
	
	int i = min;
	float tong=0, dem=0, trungBinh=0;
	while (i<=max) {
		if (i % 3 == 0) {
			tong +=i;
			dem++;
		}
		i++;
			trungBinh= tong/dem; 
			System.out.println("\nTrung bình cộng:" + trungBinh );
		
		
	
	}
}
}
