package hrmanagement;

import java.util.Comparator;

public class compareworker implements Comparator<worker> {
//
	@Override
	public int compare(worker o1, worker o2) {
		// TODO Auto-generated method stub
		if(o2.moneyperhour() != 0 && o1.moneyperhour() != 0) {
			return o2.moneyperhour().compareTo(o1.moneyperhour());
		} else if (o1.moneyperhour() != 0)
			return -1;
		return 1;
	}

}
