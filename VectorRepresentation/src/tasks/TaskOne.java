package tasks;

import java.util.ArrayList;

import item.WordNode;
import item.*;
public class TaskOne {

	public static void main(String[] args) {
		Vector t1 = new Vector();
		Vector t2 = new Vector();
		
		t1.list.add(1.0);
		t1.list.add(4.0);
		t1.list.add(5.0);
		
		t2.list.add(1.0);
		t2.list.add(4.0);
		t2.list.add(5.0);
		
		Vector test = Vector.normalize(t1);
		
		System.out.println(test);
		

	}

}
