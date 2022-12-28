package JavaConcepts;

import java.util.ArrayList;

public class ArrayListConcept {
	public static void main(String args[]) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(false);
		ar.add('C');
		ar.add("Akarsh");
		System.out.println(ar.size());
		System.out.println("******");
		System.out.println(ar.get(2));
		System.out.println("******");
		
		for (int i = 0 ; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("******");
		
		 double d[] = new double[5];
		 d[1] = 55.89;
		 d[2] = 34;
		 d[0] = 2;
		 d[3] = 234.894;
		 
		for (int i = 0; i < d.length ; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("*******");
		
		ArrayList<Integer> L = new ArrayList<Integer>();
		L.add(null);
		L.add(100);
		L.add(34);
		L.add(43);
		
		for(int i = 0 ; i < L.size(); i++ ) {
			System.out.println(L.get(i));
		}
		
	}

}
