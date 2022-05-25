// Tạo lớp mô tả sinh viên bao gồm họ tên,
// điểm và các phương thức nhập xuất và xếp loại học lực.


package Class;

import java.util.Scanner;

public class StudentClass {
	private String tenSV;
	private double diemTB;
	
	public void nhap() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		tenSV = scanner.nextLine();
		System.out.println("Nhập điểm sinh viên: ");
		diemTB = scanner.nextDouble();
		
	}
	public void xuat() {
		System.out.println("=========================");
		System.out.printf("Họ và tên: %s - Điểm TB: %f - Xếp loại: %s",
				tenSV, diemTB, hocLuc());
	
	}
	public String hocLuc() {
		if (diemTB >= 8 && diemTB <= 10) {
            return "Giỏi";
        }
        if (diemTB >= 6.5 && diemTB < 8) {
            return "Khá";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung bình";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yếu";
        }
		return tenSV;
}
	public static void main(String[] args) {
		StudentClass st = new StudentClass();
		st.nhap();
		st.xuat();
	}
}



