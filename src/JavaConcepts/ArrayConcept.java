package JavaConcepts;

public class ArrayConcept {
	public static void main(String args[]) {
		int i[] = new int[4];
		i[0] = 3;
		i[1] = 34;
		i[2] = 21;
		i[3] = 287;
	//	i[4] = 333;
		for(int j = 0 ; j < i.length ; j++) {
			System.out.println(i[j]);
		}
	}
}
