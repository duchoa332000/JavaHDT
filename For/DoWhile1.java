package For;
//  Cho một mảng số nguyên arr, viết chương trình java xuất ra giá trị đảo ngược mảng, 
//ví dụ arr[] = {1, 2, 3, 4, 5} => output 5, 4, 3, 2, 1.
public class DoWhile1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5 };

		int i = arr.length - 1;
	do {
		System.out.print(arr[i] + " ");
		i--;
		
		
		
	} while (i>=0);
	}
	
}
