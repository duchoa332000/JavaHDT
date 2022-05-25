package Encapsulation;

public class TestPerson {
	
public static void main(String[] args) {
	Person ps = new Person();
	ps.setHoTen("Nguyễn Đức Hòa");
	ps.setCmnd("123456789");
	System.out.println("Họ tên: " + ps.getHoTen() + ", CMND: " + ps.getCmnd());
}
}
