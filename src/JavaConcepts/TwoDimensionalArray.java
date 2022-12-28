package JavaConcepts;

public class TwoDimensionalArray {
	public static void main(String args[]) {
		String n[][] = new String[3][5];
		n[0][0] = "A";
		n[0][1] = "B";
		n[0][1] = "C";
		n[0][1] = "D";
		n[0][1] = "E";
		n[1][0] = "A1";
		n[1][1] = "B1";
		n[1][2] = "C1";
		n[1][3] = "D1";
		n[1][4] = "E1";
		n[2][0] = "A2";
		n[2][1] = "B2";
		n[2][2] = "C2";
		n[2][3] = "D2";
		n[2][4] = "E2";
		
		for (int row = 0 ; row < n.length ; row++ ) {
			for (int col = 0 ; col < n[0].length ; col++ ) {
				System.out.print(n[row][col] + "," + " ");
			}
			System.out.println();
		}
		
	}
}
