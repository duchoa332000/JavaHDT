package hrmanagement;

import java.util.Comparator;

public class comparehuman implements Comparator<human> {
	@Override
	public int compare(human o1, human o2) {
		// TODO Auto-generated method stub
		if (o1.getFirstname() != null && o2.getFirstname() != null) {
			return o1.getFirstname().compareTo(o2.getFirstname());
		}
		return 0;
	}
}
