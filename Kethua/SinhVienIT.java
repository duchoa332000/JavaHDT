package Kethua;

public class SinhVienIT extends SinhVien {
	

	public double diemJava, diemCss, diemHtml;
	
	public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
		super(hoTen,"IT");
		this.diemJava= diemJava;
		this.diemCss= diemCss;
		this.diemHtml = diemHtml;
	}
	
	@Override
	public double getDiem() {
		return (2*diemJava + diemCss + diemHtml)/4;
	}
	
	// Thêm phương thức toString để xuất thông tin sinh viên IT
	@Override
	public String toString() {
		return "SinhVienIT [diemJava=" + diemJava + ", diemCss=" + diemCss + ", diemHtml=" + diemHtml + ", hoTen="
				+ hoTen + ", nganh=" + nganh + "]";
	}
}
