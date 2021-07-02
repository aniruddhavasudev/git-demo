package selone;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylissst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    ArrayList list = new ArrayList();
	    
        list.add("20");
        list.add("30");
        list.add("40");
        
        System.out.println(list.size());
        System.out.println("While Loop:");
        
        Iterator itr = list.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
		
		
	}

}
