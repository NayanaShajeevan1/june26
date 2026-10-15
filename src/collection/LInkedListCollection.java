package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<String>();
		li.add("anurag");
		li.add(50);
		li.add("aswajith");
		li.add(40.80);
		li.add("riya");
		li.add(40);
		System.out.println(li);
		System.out.println("collecton siz="+(li.size()));
		//forloop diplay elements in sequential way
		
		//random access
		for each(String )
		System.out.println("4th index value="+(li.get(3)));
		
		li.add("minsha");
		li.add(48);
		System.out.println(li);
		
		li.remove(5);
		System.out.println(li);

		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

	}

}
