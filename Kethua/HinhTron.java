package Kethua;
// Kế thừa: + Mục đích của kế thừa là tái sử dụng
// 			+ Lớp con được sở hữu các tài sản(trường, phương thức) của lớp cha
//			+ Lớp con được sở hữu các tài sản public hoặc protected của lớp cha
import java.util.Scanner;

public class HinhTron extends HT {
double banKinh;

public void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Bán Kính: ");
	banKinh = sc.nextDouble();
	
}
public void xuat() {
	System.out.println("Chu Vi HT: " + ChuViHT());
	System.out.println("Diện Tích HT: " + DienTichHT());
	
}
public double ChuViHT() {
return banKinh*Math.PI*2;	
}

public double DienTichHT() {
	return banKinh* banKinh*Math.PI;
}
public static void main(String[] args) {
	HinhTron ht = new HinhTron();
	ht.nhap();
	ht.xuat();
}
}
