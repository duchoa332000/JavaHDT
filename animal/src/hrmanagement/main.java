package hrmanagement;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class main {
	
public static void main(String[] args) {
	student s1 = new student("Hòa", "Nguyễn", 3);
	student s2 = new student("Hằng", "Phạm", 5);
	student s3 = new student("Dương", "Trần", 2);
	student s4 = new student("Tú", "Danh", 1);
	student s5 = new student("Anh", "Hồ", 6);
	student s6 = new student("Huyền", "Quách", 4);
	student s7 = new student("Khánh", "Nguyễn", 8);
	student s8 = new student("Chi", "Phạm", 7);
	student s9 = new student("Tài", "Tống", 9);
	student s10 = new student("Tuấn", "Phạm", 12);
	ArrayList<student> liststudent = new ArrayList<>(10);
	liststudent.add(s1);
	liststudent.add(s2);
	liststudent.add(s3);
	liststudent.add(s4);
	liststudent.add(s5);
	liststudent.add(s6);
	liststudent.add(s7);
	liststudent.add(s8);
	liststudent.add(s9);
	liststudent.add(s10);
	ArrayList<worker> listworker = new ArrayList<worker>(10);
		worker w1 = new worker("Hoàng", "Phạm", 800, 8 );
		worker w2 = new worker("Hùng", "Nguyễn", 878, 7 );
		worker w3 = new worker("Bảo", "Trần", 723, 8 );
		worker w4 = new worker("Hà", "Hồ", 1000, 8 );
		worker w5 = new worker("Ngân", "Đặng", 456, 8 );
		worker w6 = new worker("Ý", "Danh", 656, 8 );
		worker w7 = new worker("Long", "Hồ", 750, 8 );
		worker w8 = new worker("Ánh", "Nguyễn", 500, 8 );
		worker w9 = new worker("Thảo", "Phạm", 786, 8 );
		worker w10 = new worker("Lý", "Bùi", 550, 8 );
		listworker.add(w1);
		listworker.add(w2);
		listworker.add(w3);
		listworker.add(w4);
		listworker.add(w5);
		listworker.add(w6);
		listworker.add(w7);
		listworker.add(w8);
		listworker.add(w9);
		listworker.add(w10);
	

	ArrayList<human> listhuman = new ArrayList(liststudent.size() + listworker.size());
	listhuman.addAll(liststudent);
	listhuman.addAll(listworker);
	
	Collections.sort(liststudent, student.comparestudent);
	for (student students : liststudent) {
		System.out.println(students);
	}
	
	Collections.sort(listworker, worker.compareworker);
	for (worker workers : listworker) {
		System.out.println(workers);
	}
	
System.out.println("----------------------------------------------------------------------------------------------");	

	Collections.sort(listhuman, human.comparehuman);
	for (human humans : listhuman) {
		System.out.println(humans);
	}

}


}
