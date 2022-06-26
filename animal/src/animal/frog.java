package animal;

public class frog extends animal {
	
	public frog(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}

	public void sound() {
		System.out.println ("Frog name is: " + getName() + ", its a sex: " + getSex()+ ", and its "+ getAge()+ " years old.");
		System.out.println("Ộp ộp");
	
		
	}
}
