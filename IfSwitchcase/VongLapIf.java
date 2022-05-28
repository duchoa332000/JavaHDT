package IfSwitchcase;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class VongLapIf {
public static void main(String[] args) {
	int a, b;
	double nghiem;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhập a: ");
	a= sc.nextInt();
	
	System.out.println("Nhập b: ");
	b = sc.nextInt();
	if (a==0) {
		if (b==0) {
			System.out.println("vô số nghiệm");
		} else {
			System.out.println("vô nghiệm");

		}
	}
	else {
		nghiem = -b/a;
		System.out.println("Nghiệm x= " + -b/a);
	}
}
}
