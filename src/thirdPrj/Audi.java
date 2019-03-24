package thirdPrj;

public class Audi {
	public String model;
	public String color;
	public String gear;
	public int price;
	
	public Audi() {
		// TODO Auto-generated constructor stub
		System.out.println("Audi constructor  ");
		
	}
	
	public void run() {
		System.out.println("run()    ");
	}
	public void stop() {
		System.out.println("stop() ");
	}
	public void info() {
		System.out.println(" info()");
		System.out.println("model: " + model);
		System.out.println("color: "+ color);
		System.out.println("gear: "+ gear);
		System.out.println("price: " + price);
	}

}
