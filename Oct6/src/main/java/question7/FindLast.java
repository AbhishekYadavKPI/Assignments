package question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindLast {
	public int LastElement() {
		
	
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,5,8,4,6,3,2,9,10,7));
		List<Integer> list = new ArrayList<Integer>(set1);
		int l=(set1.size()-1);
		System.out.println(list);
		//list.forEach(n->{if(list.indexOf(n)==l)System.out.println(n);});
		int m = list.get(l);	
		return m;
	}
}


