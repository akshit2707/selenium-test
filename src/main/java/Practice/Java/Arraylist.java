package Practice.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(4);
		a1.add(9);
		a1.add(4);
		a1.add(7);
		a1.add(22);
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Collections.sort(a1);
	
		Set<Integer> set=a1.stream().collect(Collectors.toSet());
		List<Integer> map=set.stream().collect(Collectors.toList());
		System.out.println(set);
		Iterator<Integer> itr=a1.iterator();
		
		itr.forEachRemaining(b->{System.out.print(b+" ");});
		System.out.println();
		a1.forEach(a->{System.out.print(a%2);
			
		});
		
		
	}

}
