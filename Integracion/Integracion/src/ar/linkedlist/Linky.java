package ar.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		
		//https://www.youtube.com/watch?v=YQQio9BGWgs
		//https://www.javatpoint.com/java-linkedlist
		
		LinkedList linky = new LinkedList();
		
		linky.add("Lan");
		linky.add("Boris");
		linky.add("Hercu");
		
		linky.remove(0);
		
		System.out.println(linky.getFirst());
		
		System.out.println(linky);
		
		System.out.println("--------------");
		
		
		
		LinkedList<Integer> i = new LinkedList<Integer>();
		
		i.add(4);
		i.add(99);
		i.add(77);
		
		System.out.println(i.get(0));
		
		Iterator it = i.iterator();
		while(it.hasNext()) {
			if((int) it.next() == 77) {
				System.out.println("Est� el 77");
			}
		}
		
		System.out.println(i.isEmpty());

	}

}
