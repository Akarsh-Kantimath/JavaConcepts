package JavaConcepts;

public class MethodOverriding extends Universe {
	public static void main(String args[]) {
		Planets p = new Planets();
		p.Stars();
		p.Galaxy();
		p.Space();
		System.out.println("*****");
		Universe u = new Universe();
		u.Galaxy();
		u.Space();
		u.Stars();
		System.out.println("*********");
		Universe s = new Earth();
		s.Space();
		Planets  t = (Planets) new Universe();
		t.Galaxy();
	}
}

class Universe {
	public void Galaxy() {
		System.out.println("Universe Galaxy");
	}
	public void  Stars() {
		System.out.println("Universe Satrs ");
	}
	public void Space() {
		System.out.println("universe Space");
	}
}

class Planets extends Universe {
	public void Stars() {
		System.out.println("Planets stars");
	}
	public void Space() {
		System.out.println("Planets Space");
	}
	public void total() {
		System.out.println("Total numbers eight");
	}
}

class Earth extends Planets {
	public void Space() {
		System.out.println("Earth space");
	}
	public void Living() {
		System.out.println("Earth living");
	}
}