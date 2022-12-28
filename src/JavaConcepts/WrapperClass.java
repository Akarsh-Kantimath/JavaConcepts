package JavaConcepts;

public class WrapperClass {
	public static void main(String args[]) {
		// String to int
		String x = "100";
		int i = Integer.parseInt(x);
		System.out.println(i);
		
		//String to Double
		String y = "234.875";
		double j = Double.parseDouble(y);
		System.out.println(j);
		
		//String to Boolean
		String z = "True";
		Boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
	
		//Int to String Conversion
		int a = 632;
		String val = String.valueOf(a);
		System.out.println(val);
	}
}
