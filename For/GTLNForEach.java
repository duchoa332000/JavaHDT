package For;
//Tìm giá trí lớn nhất của mảng gồm 8 phần tử arr = {8, 5, 7, 3, 9, 2, 1, 6}.
public class GTLNForEach {
public static void main(String[] args) {
	int[] arr = {8, 5, 7, 3, 9, 2, 1, 6};
	int max = arr[0];
	for (int i : arr) {
		if (max<=i) {
			max = i;
		}
	}
	System.out.println("Giá trị lớn nhất: " + max);
}
}
