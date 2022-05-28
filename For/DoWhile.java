package For;

import java.util.Scanner;
//Viết chương trình tính tổng các số nguyên từ 1 đến 10.
public class DoWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int sum=0;
		int i=1;
		do {
			sum += i;
			i++;
		} while (i<=10);
		System.out.println("Tổng các số nguyên từ 1 đến 10: " + sum);
		
}
}
