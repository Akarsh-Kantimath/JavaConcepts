package JavaConcepts;

public class Harbour {
	String ShipName; //Global Variable
	String Goods;
	
	public static void main (String args[]) {
		
		Harbour a = new Harbour();
		a.ShipName = "Ambuja";
		a.Goods = "Cement";
		Harbour b = new Harbour();
		b.ShipName = "Tata";
		b.Goods = "Cars";
		Harbour c = new Harbour();
		c.ShipName = "El dariod";
		c.Goods = "Weapons";
		
		System.out.println(a.Goods);
		System.out.println(c.ShipName);
		
	}

}
