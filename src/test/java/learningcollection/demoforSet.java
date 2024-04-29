package learningcollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class demoforSet {

	public static void main(String[] args) {
		
		List l=new ArrayList();	
		l.add("a"); //a b c d e c
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("c");
		 Iterator i= l.iterator();
		 
		  while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	
		
		
//		Set s=new HashSet();
//		s.add(1);//1 3 2 4 6 5
//		s.add(3);
//		s.add(2);
//		s.add(4);
//		s.add(6);
//		s.add(5);
//		System.out.println(s);
	}

}
