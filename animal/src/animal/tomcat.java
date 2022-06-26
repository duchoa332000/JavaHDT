package animal;

public class tomcat extends cats {

	public tomcat(String name, String sex, int age) {
		super(name, "male", age);
		// TODO Auto-generated constructor stub
	}

	public void sound() {
		System.out.println ("Tomcat name is: " + getName() + ", its a sex: " + getSex()+ ", and its "+ getAge()+ " years old.");
		System.out.println("MEOW MEOW");
	}

}
