package Kethua;

import java.util.Scanner;

public class HinhChuNhat extends HCN {
	double dai, rong;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dài: ");
		dai = sc.nextDouble();
		System.out.println("Rộng: ");
		rong = sc.nextDouble();
	}
	public void xuat() {
		System.out.println("Chu Vi: " + ChuViHCN());
		System.out.println("Diện Tích: " + DTHCN());
	}
	public double ChuViHCN() {
		return (dai+rong)*2 ;
	}
	public double DTHCN() {
		return (dai*rong);
	}
	
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.nhap();
		hcn.xuat();
	}
}
