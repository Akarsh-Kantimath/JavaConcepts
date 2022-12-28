package JavaConcepts;

public class CallByValue {
	public static void main(String args[]) {
		int x = 20;
		int y = 30;
		CallByValue Obj = new CallByValue();
		System.out.println(Obj.testsum(x,y));
	}
	public int testsum(int a, int b) {
		int sum = a + b ;
		return sum;
	}
}
