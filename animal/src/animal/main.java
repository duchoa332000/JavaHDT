package animal;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class main {
	public static void Calculator(ArrayList<animal> animalList) {
		byte sum = 0;
		float avg;
		 for (animal animal : animalList) {
			sum += animal.age;
		}
		 avg = sum/3 ;
		 System.out.println("AVG: " + avg);
	}
	
	
	static ArrayList<animal> animalList = new ArrayList<>();
	
	public static void main(String[] args) {
		 ArrayList<animal> dogList = new ArrayList<>();
		 dogList.add(new dog("Lu", "male", 1));
		 dogList.add(new dog("Ki", "falemale", 4));
		 dogList.add(new dog("Muc", "male", 3));
		 Calculator(dogList);
		 for (animal dog : dogList) {
				dog.sound();
			}
		 
		 System.out.println("_________________________________________________________");
			
		 
		 
		 ArrayList<animal> kittenList = new ArrayList<>();
		 kittenList.add(new kitten("Miu","",2));
		 kittenList.add(new kitten("Joe","",5));
		 kittenList.add(new kitten("Ka","",4));
		 Calculator(kittenList);
			for (animal kitten : kittenList) {
				kitten.sound();
			}
			
			 System.out.println("_________________________________________________________");
				
			 
		 ArrayList<animal> tomcatList = new ArrayList<>();
		 tomcatList.add(new tomcat("Den","",6));
		 tomcatList.add(new tomcat("Mi","",4));
		 tomcatList.add(new tomcat("Lu","",8));
		 Calculator(tomcatList);
		 for (animal tomcat : tomcatList) {
				tomcat.sound();
			}
		 System.out.println("_________________________________________________________");
			
		 ArrayList<animal> frogList = new ArrayList<>();
		 frogList.add(new frog("Ech","female",5));
		 frogList.add(new frog("Nhai","male",7));
		 frogList.add(new frog("Noc","female",2));
		 Calculator(frogList);
		for (animal frog : frogList) {
			frog.sound();
		}
		
		 System.out.println("_________________________________________________________");
			
	}

	
}
