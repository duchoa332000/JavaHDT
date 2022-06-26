package animal;

import java.util.ArrayList;

abstract public class animal implements isound{
	 String name;
	 String sex;
	 int age;
	
	public animal(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

//	public String toString() {
//		return "This is " + this.name.toString() + 
//	            " -It is "+ this.sex.toString()+
//	            "-And is "+this.age+" years old. \n"; 
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
