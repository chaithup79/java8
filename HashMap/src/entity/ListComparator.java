package entity;

import java.util.Comparator;

public class ListComparator implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		
		
		
		return o1.getAge() - o2.getAge();
	}
}

