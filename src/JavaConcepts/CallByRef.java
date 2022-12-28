package JavaConcepts;

public class CallByRef {
	int p, q ;
	public static void main(String args[]) {
		CallByRef obj = new CallByRef();
		obj.p = 20; obj.q = 30;
		obj.testsum(obj);
	}
	public void testsum(CallByRef ref) {
		int sum = ref.p + ref.q ;
		System.out.println(sum);
	}
}
