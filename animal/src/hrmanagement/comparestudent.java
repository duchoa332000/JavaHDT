package hrmanagement;

import java.util.Comparator;

class comparestudent implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		if(o1.getGrade() != 0 && o2.getGrade() != 0) {
			return o1.getGrade().compareTo(o2.getGrade());
		} 
		return 0;
		
	}

}
