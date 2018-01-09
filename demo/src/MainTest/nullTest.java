package MainTest;

import java.util.ArrayList;
import java.util.List;

public class nullTest {
	public static void main(String args[]){
		List<Long> aList = new ArrayList<Long>();
		Long a = null;
		Long b = null;
		aList.add(a);
		aList.add(b);
		aList.remove(a);
		System.out.println(aList.size());
		System.out.println(aList.equals(null));
		System.out.println(new Integer(null) == 0);
		
		
	}

}
