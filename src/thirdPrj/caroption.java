package thirdPrj;

public class caroption {
	
	public String navi;
	public String decoration;
	public int power;
	public String enginType;
	
	public caroption(String n,String d, int p , String e) {
		System.out.println("Car Option constructor ");
		navi=n;
		decoration=d;
		power=p;
		enginType=e;
	}
	public void infDetail() {
		System.out.println("info detail----- ");
		System.out.println("navigation: " + navi);
		System.out.println("Horse Power : " + power);
		System.out.println("Decoraton: " + decoration);
		System.out.println("Engine Type: " + enginType);
	}

}
