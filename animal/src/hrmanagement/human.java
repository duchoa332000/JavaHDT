package hrmanagement;

import java.util.Comparator;

abstract public class human implements Comparable<human> {
// public static Comparator compareTo;
 public static Comparator<human> comparehuman =  new comparehuman();

String firstname, lastname;
 

public human(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}




@Override
public String toString() {
	// TODO Auto-generated method stub
	return  "[lastName= " + firstname + ", firstName= " + lastname + "]";
}




public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}
 
public int compareTo(human o) {
	if (o.getFirstname() != null && o.getFirstname() != null ) 
		return o.getFirstname().compareTo(o.getFirstname());
		else if (o.getFirstname() != null) 
			return -1;
			
	return 0;
}

}

