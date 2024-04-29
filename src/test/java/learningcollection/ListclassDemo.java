package learningcollection;

import java.util.ArrayList;
import java.util.List;

public class ListclassDemo {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("kumar");
		li.add(1234);
	    System.out.println(li);
	    li.add(0, "sai");
	    System.out.println(li);
	    li.add(1,"ram");
	    System.out.println(li);
	    li.add("kumar");
	    System.out.println(li);
	    System.out.println(li.indexOf("kumar"));
	    li.add(678);
	    li.add("kumar");
	    System.out.println(li);
    System.out.println(li.lastIndexOf("kumar"));
    
    System.out.println(li.get(3));
    li.set(3,987);
    System.out.println(li);
    
    
	    
	    
	    
	    
//	    List a=new ArrayList();
//	    a.add(4567);
//	    a.add("hi");
//	    
//	    a.addAll(1,li);
//	    
//	    System.out.println(a);
//	    a.remove(0);
//	    System.out.println(a);
	    
	    
	    
	    
	    
	}

}
