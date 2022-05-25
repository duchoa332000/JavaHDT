package Class;

import java.util.Scanner;

//Tạo lớp mô tả sinh viên bao gồm họ tên,
//điểm và các phương thức nhập xuất và xếp loại học lực.


public class StudentEx {
private String hoTen;
private double diemTB;

public void nhap() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập họ và tên: ");
	hoTen = scanner.nextLine();
	System.out.println("Nhập điểm TB: ");
	diemTB = scanner.nextDouble();
	
}
public void xuat() {
	System.out.println("===================================================================");
	System.out.printf("Họ và tên: %s - Điểm TB: %f - Học lực: %s", hoTen, diemTB, hocLuc());
}
public String hocLuc() {
	if (diemTB>=8 && diemTB<=10 ) {
		return "Giỏi";
	}
	if (diemTB>=6.5 && diemTB<8) {
		return "Khá";
	}
	if (diemTB>=5 && diemTB<6.5) {
		return "Trung Bình";
	}
	if (diemTB>=0 && diemTB<5) {
		return "Yếu";
}
	return hocLuc();
}
public static void main(String[] args) {
	StudentEx st = new StudentEx();
	st.nhap();
	st.xuat();
}
}
