package collectionsconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> mp1 = new HashMap<Integer, String>();
	//	new ArrayList<String>(mp1.values());
		mp1.put(1, "a");
		mp1.put(2, "b");
		mp1.put(3, "c");
		mp1.put(null, "d");
		System.out.println("------" + mp1.get(5) + " --------- ");
	
		HashMap<Integer,String> mp2 = new HashMap<Integer, String>();
		
		mp2.put(1, "a");
		mp2.put(2, "b");
		mp2.put(3, "c");
		System.out.println(new ArrayList<String>(mp1.values()).equals(new ArrayList<String>(mp2.values())));
		
		
		HashSet<String> h1 = new HashSet<String>(mp1.values());
		h1.addAll(mp2.values());
		h1.removeAll(mp2.values());
		System.out.println(h1);
		
		
		
//		System.out.println(mp1.keySet().equals(mp2.keySet()));
//		
//		Set<Integer> s1 = mp1.keySet();
//		Set<Integer> s2 = mp2.keySet();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		Iterator<Integer> i1 = s1.iterator();
//		Iterator<Integer> i2 = s2.iterator();
//			//System.out.println(s2.retainAll(s1));
//		
//		HashSet<Integer> h1 = new HashSet<Integer>(mp1.keySet());
//		h1.addAll(mp2.keySet());
//		System.out.println(h1 + " :");
//		h1.removeAll(mp2.keySet());
//		System.out.println(h1 + " :: ");
//		
//		
//		if(s1.removeAll(s2)==true) {
//			System.out.println(s1);
//			
//			
//		}
//		
		}
		
		
//		mp.put("a", 1);
//		mp.put("b", 2);
//		mp.put("c", 3);
//		mp.put("d", 4);
//		mp.put("d", 5);
//		
//		
//		mp.forEach((k,v) -> System.out.println(k + "," + v));
//		
//		Iterator<String> i1  = mp.keySet().iterator();
//		
//		while(i1.hasNext()) {
//			String key = i1.next();
//			int value = mp.get(key);
//			System.out.println(key + " , " + value);
//		}
//		
//		Iterator<Entry<String, Integer>> e1 =	mp.entrySet().iterator();
//		
//		while(e1.hasNext()) {
//			System.out.println(e1.next());
//			Entry<String, Integer> entry = e1.next();
//			System.out.println(entry.getKey() + " , " + entry.getValue());
//
//		}
//
//	}

	}

