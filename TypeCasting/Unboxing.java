package TypeCasting;


//Unboxing là việc chuyển đổi tự động đối tượng lớp Wrapper sang kiểu dữ liệu nguyên thủy

import java.util.ArrayList;

public class Unboxing {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(123);
	a.add(456);
	System.out.println(a);
	int b = a.get(1);
	System.out.println(b);

}
}
