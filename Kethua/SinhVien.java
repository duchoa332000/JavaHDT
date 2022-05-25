package Kethua;

public abstract class SinhVien {
	public String hoTen, nganh;
	
	public SinhVien(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();

	public String hocLuc() {
		String hocLuc = " ";
		double getDiem = 0;
		if(getDiem>=9 && getDiem<=10 ) {
			return "Xuất sắc";
		}
		if (getDiem >= 7.5 && getDiem<9) {
			return "Giỏi";
		}
		if(getDiem >=6.5 && getDiem<7.5) {
			return "Khá";
		}
		if(getDiem>=5 && getDiem<6.5) {
			return "Trung Bình";
		}
		if (getDiem>=0 && getDiem<5) {
			return "Yếu";
		}
		return hocLuc;
	}
	public void xuat() {
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngành: " + this.nganh);
		System.out.println(" Điểm: " + getDiem());
		System.out.println(" Học Lực: " + hocLuc());
	}
}

