package animal;

public class kitten extends cats{

	public kitten (String name, String sex, int age) {
		super(name,"female", age);
		// TODO Auto-generated constructor stub
	}
	
	public void sound() {
		System.out.println ("Kitten name is: " + getName() + ", its a sex: " + getSex()+ ", and its "+ getAge()+ " years old.");
		System.out.println("meo meo");

	}
}
