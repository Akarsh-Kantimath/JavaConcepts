package ListConcept;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String args[]) {
		Employee E1 = new Employee ( "Akarsh ", 26, "Civil");
		Employee E2 = new Employee ("Kishore", 27, "Automobile");
		Employee E3 = new Employee ("Vijayanand", 28, "Mechanical");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(E1);
		ar.add(E2);
		ar.add(E3);
		
		//Iterator used to fetch the value, when object address is stored in the ArrayList
		
		Iterator<Employee> t = ar.iterator();
		while(t.hasNext()) {
			Employee emp = t.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println("*******");
		}
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Mat");
		ar1.add("Bio");
		ar1.add("Che");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Bio");
		ar2.add("Psy");
		ar2.add("Matt");
		
		ar1.addAll(ar2);
		for(int i = 0 ; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("********");
		
		ar1.removeAll(ar2);
	System.out.println(ar1.size());
		for(int i = 0 ; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("********");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Mat");
		ar3.add("Bio");
		ar3.add("Che");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Bio");
		ar4.add("Psy");
		ar4.add("Matt");
		
		ar3.retainAll(ar4);
		for(int i = 0 ; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}
		System.out.println("********");
		
	}
}
