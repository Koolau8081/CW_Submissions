
public class Cube {

	
	
	//Attributes
	private double side;
	
	
	//Constructor
	public Cube(double s) {
		
		side = s;
		
	}
	
	
	//Functions
	public static String getShape() {
	
		return ("Cube");
		
	}
	
	
	public double getSide() {
		return side;
		
	}
	
	
	public double getVolume() {
		double volume = side*side*side;
		return volume;
	}
	
	
	public double getArea() {
		double area = 6*(side*side);
		return area;
		
	}
	
	
	
	
}
