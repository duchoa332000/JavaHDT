package Polymorphism;

abstract public class DongVat {
abstract public void speak();
public static void main(String[] args) {
	DongVat cho = new Cho();
	DongVat meo = new Meo();
	
	cho.speak();
	meo.speak();
}
}