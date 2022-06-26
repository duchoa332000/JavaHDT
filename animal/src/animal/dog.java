package animal;

import java.util.ArrayList;
import java.util.List;

public class dog extends animal{
	public dog(String name, String sex, int age) {
		super(name, sex, age);
		
	}
	public void sound() {
		System.out.println ("Dog name is: " + getName() + ", its a sex: " + getSex()+ ", and its "+ getAge()+ " years old.");
		System.out.println("Gâu gâu");
		
	}

}
