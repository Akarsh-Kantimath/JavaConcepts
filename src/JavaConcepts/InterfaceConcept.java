package JavaConcepts;

interface Vehicle {
	public void wheels();
	public void engine();
	double y = 23.75;
}
interface CarFoundation {
	public void History();
}
interface Maruti extends Vehicle, CarFoundation {
	public void Brezza();
	int x = 20;
}
  class Details implements Maruti, Vehicle, CarFoundation {
	public void wheels() {
		System.out.println("Car Wheels");
	}
	public void engine() {
		System.out.println("Car Engines");
	}
	public void History() {
		System.out.println("Mercedes Benz");
	}
	public void Brezza() {
		System .out. println(" Brezza model car");
	}
}
  public class InterfaceConcept extends Details { 
		public static void main(String args[]) {
			Details d = new Details();
			System.out.println(d.y);
			d.wheels();
			d.Brezza();
			Vehicle v = new Details();
			v.engine();
			System.out.println(v.y);
				
			
		}
	}