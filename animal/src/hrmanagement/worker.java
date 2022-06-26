package hrmanagement;

import java.util.Comparator;

public class worker extends human {
	
	public static Comparator<worker> compareworker = new compareworker();

Integer weeksalary;
int workhoursperday;

public worker(String firstname, String lastname, Integer weeksalary, int workhoursperday) {
	super(firstname, lastname);
	this.weeksalary = weeksalary;
	this.workhoursperday = workhoursperday;
	// TODO Auto-generated constructor stub
}

public Integer getWeeksalary() {
	return weeksalary;
}
public void setWeeksalary(Integer weeksalary) {
	this.weeksalary = weeksalary;
}
public int getWorkhoursperday() {
	return workhoursperday;
}
public void setWorkhoursperday(int workhoursperday) {
	this.workhoursperday = workhoursperday;
}

public Integer moneyperhour() {
	Integer moneyperday = weeksalary/5;
	return moneyperday/8;
}

@Override
public String toString() {
	return "Worker: Firstname: " + this.getFirstname() + " Lastname: " + this.getLastname() + " Weeksalary= " + weeksalary
			+ ", Workhoursperday= " + workhoursperday + " Moneyperhour: " + moneyperhour();
}

}
