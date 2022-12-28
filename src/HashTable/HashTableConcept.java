package HashTable;
import java.util.Hashtable;

public class HashTableConcept {
	public static void main(String args[]) {
		Hashtable h = new Hashtable();
		h.put("A", "1st class");
		h.put("B", "2nd Grade");
		h.put("C", "3rd grade");
		h.put("D", "4th Grade");
		System.out.println(h.size());
		System.out.println(h.get("B"));
		h.put(1, "No. 1");
		h.put(2, "NO. 2");
		h.put(34.56, "Double no. ");
		h.put(false, "False boolean");
		System.out.println("*******");
		System.out.println(h.get(34.56));
		Hashtable<Integer, String> d = new Hashtable<Integer, String>();
		d.put(23, "dsfg");
		d.put(12, "acv");
		d.put(2, "sdf");
		d.put(2, "gfg");
		d.put(34, "sdf");
		System.out.println("********");
		System.out.println(d.get(34));
		System.out.println(d.get(2));
		
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(1, "a");
		t.put(2, "b");
		t.put(3, "c");
		t.put(4, "d");
		t.put(5, "e");
		t.put(6, "f");
		t.remove(2);
		System.out.println("*******");
		for(int i = 0 ; i < t.size(); i++) {
			System.out.println(t.get(i));
		}
	}
}
