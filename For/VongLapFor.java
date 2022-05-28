package For;
//Bảng cửu chương 1-9 với vòng lặp For 
public class VongLapFor {
public static void main(String[] args) {
	int x;
	
	for (int i = 1; i <= 9; i++) {
		System.out.println("\nBảng cửu chương " + i);
		for (int j = 1; j <=10; j++) {
			System.out.printf("%d x %d = %d \t",i,j,i*j);
			System.out.println(" ");
				
			
		}
	}
}
}
