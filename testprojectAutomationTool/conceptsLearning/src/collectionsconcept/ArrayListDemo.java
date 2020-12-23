package collectionsconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import javax.swing.text.DefaultEditorKit.CopyAction;


public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7));
	//	System.out.println(l1);
		
	//	Iterator<Integer> i1 =l1.iterator();

//		while(i1.hasNext()) {
//			//System.out.println(i1.next());
//		}
		
		//l1.stream().forEach(ele -> System.out.println(ele));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2,3,5,6,7,8,7));
		
//		l1.contains(l2);
//		System.out.println(l1);
//		
	Collections.sort(l2);
		
	//	System.out.println(l2);
		//System.out.println(l1.equals(l2));
		l1.contains(l2);
		System.out.println(l2);
		l2.retainAll(Collections.singleton(2));
		System.out.println(l2 + "---" );
		
		List<Integer> dl1 = l2.stream().distinct().collect(Collectors.toList());
		System.out.println(dl1);
		LinkedHashSet<Integer> dp1 = new LinkedHashSet<Integer>(l2);
		ArrayList l3 = new ArrayList(dp1);
		System.out.println(l3);
		
		
		
		CopyOnWriteArrayList<Integer> c1 = new CopyOnWriteArrayList<Integer>();
		c1.add(1);
		c1.add(2);
		
		
	}

}
