package ListConcept;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListConcept {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Akarsh");
		ll.add("Qspider");
		ll.add("Six Months");
		ll.add("Soft Suave");
		ll.add("Four Months");
		
		System.out.println(ll);
		System.out.println("********");
		
		ll.addFirst("Gulbarga");
		ll.addLast("Bangalore");
		System.out.println(ll);
		System.out.println("********");
		
		System.out.println(ll.get(0));
		
		ll.set(6, "World");
		System.out.println("********");
		System.out.println(ll);
		System.out.println("********");
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println("********");
		
		ll.remove("Qspider");
		System.out.println(ll);
		System.out.println("********");
		
		ll.remove(1);
		System.out.println(ll);
		System.out.println("********");
		
		ll.add("Royal Enfield");
		ll.add("Black");
		ll.add("Asian");
		ll.add("Wanderer");
		
		//how to print all the values of Linked List
		System.out.println("Using for Loop");
		System.out.println("********");
		for(int i = 0 ; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("********");
		System.out.println("Using for EACH Loop");
		System.out.println("********");
		for(String str : ll) {
			System.out.println(str);
		}
		System.out.println("********");
		System.out.println("Using iterators");
		System.out.println("********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("********");
		System.out.println("Using while loop");
		System.out.println("********");
		int num = 0;
		while(ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}
}
