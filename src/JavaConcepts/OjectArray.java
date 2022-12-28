package JavaConcepts;

public class OjectArray {
	public static void main(String args[]) {
		Object n[] = new Object[5];
		n[0] = 12;
		n[1] = 'A';
		n[2] = "ABC";
		n[3] = 34.98;
		n[4] = false;
		
		for (int i =0 ; i < n.length ; i++) {
			System.out.print(n[i] + " ," + " ");
		}
	}
}
