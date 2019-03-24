package thirdPrj;

public class mainClass {
	public static void main (String []args) {
		// TODO Auto-generated method stub

		Audi mycar = new Audi();
		
		mycar.model="Audi-A6L-2019";
		mycar.color="black";
		mycar.gear="Auto";
		mycar.price=5000;
		
		mycar.run();
		mycar.stop();
		mycar.info();
		
		caroption mycar1 = new caroption("on", "°¡Á×", 550, "electronic");
		mycar1.infDetail();
		
		
		
		
		
		
		
	}
	

}
