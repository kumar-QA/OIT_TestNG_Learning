package learningcollection;

import java.util.ArrayList;
import java.util.Collection;

public class demoList {

	public static void main(String[] args) {
//		
//		int a[]= {40,50,60};
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==60) {
//				System.out.println("true");
//			}else
//			{
//				System.out.println("false");
//			}
//		}


		
		Collection al=new ArrayList();
		System.out.println(al.size());
		al.add("kumar");
		al.add(20);
		al.add(true);
		al.add(30.500);
		
		System.out.println("before remove:"+al);
		al.remove(20);
		System.out.println("After remove: "+al);
		
		
		Collection al1=new ArrayList();
		al1.add("hi");
		al1.addAll(al);
		System.out.println(al1);
		System.out.println(al1.retainAll(al));
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		
		
	
		
	}
	
}
