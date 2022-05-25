package Kethua;

public class SinhVienBiz extends SinhVien {
public SinhVienBiz(String hoTen, double diemMarketting, double diemSales) {
		super(hoTen, "Biz");
		this.diemMarketting = diemMarketting;
		this.diemSales= diemSales;
	}

double diemMarketting, diemSales;

@Override
public double getDiem() {
	// TODO Auto-generated method stub
	return  (2*diemMarketting + diemSales)/3;
}
}
