package JavaConcepts;

public class MethodOverloading {
	public void sum() {
		System.out.println("Sum method zero param ");
	}
	public void sum(int i) {
		System.out.println("Sum method 1 param "+ i);
	}
	public void sum(int k, int l) {
		System.out.println("Sum of 2 no's " + (k+l));
	}
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(56);
		obj.sum(32, 23);
	}
}
